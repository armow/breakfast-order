package project;

import java.awt.*;
import javax.swing.*;

public class Frame_server extends JFrame{
	
	int CONTAINER_HEIGHT;
	Btnlistener_inServer btnlistnr;
	JPanel clientContainer_in;
	JScrollPane clientContainer;
	
	public Frame_server(){
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("server window");
		setResizable(false);
		
		JLabel title = new JLabel("SERVER");
		title.setLocation(20, 8);
		title.setSize(150, 50);
		title.setFont(new Font("Courier", Font.BOLD, 28));
		add(title);
		
		//JPanel cardPanel = new JPanel();
		//CardLayout cardLayout = new CardLayout();
		//cardPanel.setLayout(cardLayout);
		
		JPanel display_client = new JPanel();
		display_client.setSize(800,600);
		display_client.setLocation(0, 0);
		display_client.setLayout(null);
		add(display_client);
		
		CONTAINER_HEIGHT=400;
		clientContainer_in = new JPanel();
		clientContainer_in.setPreferredSize(new Dimension(720,CONTAINER_HEIGHT)); // adjust the height based on the client list
		clientContainer_in.setLocation(0,0);
		clientContainer_in.setBackground(Color.DARK_GRAY);
		clientContainer_in.setLayout(null);
		
		btnlistnr = new Btnlistener_inServer();
		
		clientContainer = new JScrollPane();
		clientContainer.setViewportView(clientContainer_in);
		clientContainer.setLocation(20,50);
		clientContainer.setSize(740, 500);
		clientContainer.setBackground(Color.DARK_GRAY);
		//add(clientContainer);
		display_client.add(clientContainer);
		
		//cardPanel.add(display_client,"0");
		//cardLayout.show(cardPanel,"0");

		//add(cardPanel);
		
		setVisible(true);
	}
}
