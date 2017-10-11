package project;

import java.awt.*;
import javax.swing.*;

public class Panel_clientItem extends JPanel{
	
	public int which_client;
	
	public JLabel display_client;
	public JLabel display_phone;
	public JLabel display_food; // might be long, so 'click the clientItem to open the full clientItem'
	public JLabel display_sum;
	
	
	public Panel_clientItem(int which_client, Btnlistener_inServer btnlistener_inServer){
		this.which_client = which_client;
		//System.out.println("in clientItem: "+this.which_client);
		
		setSize(680,100);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JButton btn_ready = new JButton("READY");
		btn_ready.setSize(140,45);
		btn_ready.setLocation(540,2);
		btn_ready.addActionListener(btnlistener_inServer);
		
		JButton btn_open = new JButton("check full order");
		btn_open.setSize(140,45);
		btn_open.setLocation(540,52);
		btn_open.addActionListener(btnlistener_inServer); // click again to close the clientItem
		
		display_client = new JLabel("客戶:"+Integer.toString(this.which_client));
		display_client.setSize(70,50);
		display_client.setLocation(0,20);
		display_client.setFont(new Font("Courier", Font.PLAIN, 18));
		
		display_phone = new JLabel("聯絡電話:"+Server.client_list.get(this.which_client).phone);
		display_phone.setSize(200,50);
		display_phone.setLocation(130,20);
		display_phone.setFont(new Font("Courier", Font.PLAIN, 18));
		
		display_sum = new JLabel("總金額:"+Server.client_list.get(this.which_client).food[0].price);
		display_sum.setSize(200,50);
		display_sum.setLocation(350,20);
		display_sum.setFont(new Font("Courier", Font.PLAIN, 18));
		
		add(btn_ready);
		add(btn_open);
		add(display_client);
		add(display_phone);
		add(display_sum);
		
	}
}
