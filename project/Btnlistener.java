package project;

import java.awt.event.ActionEvent;
import java.net.*;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

import javax.swing.*;


public class Btnlistener implements ActionListener{
	public JPanel cardPanelTmp;
	public CardLayout cardLayoutTmp;
	static public Socket connectionSock;
	static public DataOutputStream serverOutput;
	static public ObjectOutputStream outToServer;
	
	
	public Btnlistener(JPanel cardPanel,CardLayout cardLayout){
		cardPanelTmp = cardPanel;
		cardLayoutTmp = cardLayout;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("my cart")){
			Test.cart.itemContainer_in.removeAll();
			Test.c[0].price=0;
			for(int i=1; i<31; ++i){
				if(Test.c[i]!=null){
			        Test.c[0].price=Test.c[0].price+Test.c[i].num*Test.c[i].price;
				    Test.cart.sum_display.setText(("Total:"+ Test.c[0].price));
				}
			}
			int j=0;
			for(int i=0; i<31; ++i){
				if(Test.c[i]!=null && Test.c[i].num>0){
					++j;
					Panel_cartItem one = new Panel_cartItem(i);
					one.setLocation(20,(j-1)*95+20);
					Test.cart.itemContainer_in.add(one);
				}
			}
			Test.cart.CONTAINER_HEIGHT = (j-1)*120+20;
			Test.cart.itemContainer_in.setPreferredSize(new Dimension(700,Test.cart.CONTAINER_HEIGHT));
			
			cardLayoutTmp.show(cardPanelTmp,"1");
			
		}else if(e.getActionCommand().equals("back to menu")){
			Test.menu.drink.setAllText();
			Test.menu.ham.setAllText();
			Test.menu.egg.setAllText();
			Test.menu.other.setAllText();
			Test.menu.toast.setAllText();
			cardLayoutTmp.show(cardPanelTmp,"0");
		}else if(e.getActionCommand().equals("進入")){
			cardLayoutTmp.show(cardPanelTmp,"0");
		}else if(e.getActionCommand().equals("離開")){
			System.exit(0);
		}else if(e.getActionCommand().equals("說明")){
			cardLayoutTmp.show(cardPanelTmp,"3");
		}else if(e.getActionCommand().equals("取消")){
			cardLayoutTmp.show(cardPanelTmp,"0");
		}else if(e.getActionCommand().equals("done")){
			cardLayoutTmp.show(cardPanelTmp,"5");
		}else if(e.getActionCommand().equals("go to menu")){
			cardLayoutTmp.show(cardPanelTmp,"0");
		}else if(e.getActionCommand().equals("取餐")){
			System.exit(0);
		}else if(e.getActionCommand().equals("送出")){
			cardLayoutTmp.show(cardPanelTmp,"4");
			Test.check.setVisible(false);
			try{
				connectionSock = new Socket("127.0.0.1",8000); // IP
				serverOutput= new DataOutputStream(connectionSock.getOutputStream());
				outToServer = new ObjectOutputStream(connectionSock.getOutputStream());
				
				serverOutput.writeBytes(Test.check.phone.getText()+"\n");
				outToServer.writeObject(Test.c);
				
				Thread waitline = new Thread_waitLine();
				waitline.start();

			    }catch(IOException exc){
				     exc.printStackTrace();
			    }
		}else if(e.getActionCommand().equals("buy!")){
			Test.check.setVisible(true);
		}else{
			System.out.println("error in switching panels (at btnlistener)");
		}
	}
}
