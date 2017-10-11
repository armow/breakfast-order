package project;

import java.awt.*;
import javax.swing.*;

public class Frame_display_order extends JFrame{
	
	public JPanel itemContainer_in;
	public int CONTAINER_HEIGHT;
	public JScrollPane itemContainer;
	public JLabel sum_display;
	
	public Frame_display_order(int which_client){
		
		Test.c[0]=new Cart("",0,0);
		
		setTitle("check order");
		setResizable(false);
		setLocation(0,0);
		setSize(700,400);
		
		setLayout(null);
		
		JLabel back= new JLabel(new ImageIcon("src/image/ground.jpg"));
	    back.setSize(700,400);
	    add(back);
		
		JLabel title = new JLabel("THE ORDER");
		title.setLocation(50, 20);
		title.setSize(200, 50);
		title.setFont(new Font("Courier", Font.BOLD, 32));
		//title.setForeground(Color.red);

		itemContainer_in = new JPanel();
		itemContainer_in.setLocation(0,0);
		itemContainer_in.setLayout(null);
		
		JTextArea order = new JTextArea();
		String all_order = "";
		int i=1;
		int j=0;
		for(i=1;i<31;++i){
			if(Server.client_list.get(which_client).food[i]!=null){
				++j;
				all_order = all_order + Server.client_list.get(which_client).food[i].name.substring(6) + " x" + Server.client_list.get(which_client).food[i].num + "\n";
			}
		}
		itemContainer_in.setPreferredSize(new Dimension(550,j*18));
		itemContainer_in.setBackground(Color.white);
		
		order.setText(all_order);
		order.setSize(550,j*18);
		order.setLocation(0,0);
		itemContainer_in.add(order);

		itemContainer = new JScrollPane();
		itemContainer.setViewportView(itemContainer_in);
		itemContainer.setLocation(40,80);
		itemContainer.setSize(600,270);
		itemContainer.setBackground(Color.white);

		// a JLabel to calculate the sum of the price, then add it below
		sum_display = new JLabel("Total:"+ Server.client_list.get(0).food[0].price);
		sum_display.setLocation(100, 490);
		sum_display.setSize(200, 50);
		sum_display.setFont(new Font("Courier", Font.BOLD, 40));
		//sum_display.setForeground(Color.red);
		
		back.add(sum_display);
		back.add(title);
		back.add(itemContainer);
		setVisible(true);
	}
}



