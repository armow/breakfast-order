package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panel_Cart extends JPanel{
	
	public JPanel itemContainer_in;
	public int CONTAINER_HEIGHT;
	public JScrollPane itemContainer;
	public JLabel sum_display;
	
	public Panel_Cart(Btnlistener btn_ear){
		
		Test.c[0]=new Cart("",0,0);
		
		setLocation(0,0);
		setSize(800, 600);
		setLayout(null);
		
		JLabel back= new JLabel(new ImageIcon("src/image/ground.jpg"));
	    back.setSize(800,600);
	    add(back);
		
		JLabel title = new JLabel("MY CART");
		title.setIcon(new ImageIcon("src/image/cart.png"));
		title.setLocation(50, 20);
		title.setSize(200, 100);
		title.setFont(new Font("Courier", Font.BOLD, 32));
		//title.setForeground(Color.red);
		
		JButton btn_back = new JButton("back to menu");
		btn_back.setIcon(new ImageIcon("src/image/back.jpg"));
		btn_back.setLocation(580, 490);
		btn_back.setSize(170, 50);
		//this.btn_ear = btn_ear;
		btn_back.addActionListener(btn_ear);
		btn_back.setFont(new Font("Courier", Font.BOLD, 22));
		//btn_back.setForeground(Color.red);
		
		JButton btn_ok = new JButton("buy!");
		btn_ok.setLocation(450, 490);
		btn_ok.setSize(110, 50);
		btn_ok.addActionListener(btn_ear);
		btn_ok.setIcon(new ImageIcon("src/image/buy.jpg"));
		//btn_ok.setForeground(Color.red);
		
			
		itemContainer_in = new JPanel();
		itemContainer_in.setPreferredSize(new Dimension(700,CONTAINER_HEIGHT));
		itemContainer_in.setLocation(0,0);
		itemContainer_in.setBackground(Color.yellow);
		itemContainer_in.setLayout(null);

		itemContainer = new JScrollPane();
		itemContainer.setViewportView(itemContainer_in);
		itemContainer.setLocation(20,80);
		itemContainer.setSize(740, 400);
		itemContainer.setBackground(Color.white);

		// a JLabel to calculate the sum of the price, then add it below
		sum_display = new JLabel("Total:"+ Test.c[0].price);
		sum_display.setLocation(100, 490);
		sum_display.setSize(200, 50);
		sum_display.setFont(new Font("Courier", Font.BOLD, 40));
		//sum_display.setForeground(Color.red);
		
		back.add(sum_display);
		back.add(btn_ok);
		back.add(btn_back);
		back.add(title);
		back.add(itemContainer);
		
	}
}



