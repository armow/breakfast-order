package project;

import javax.swing.*;

public class Panel_Wait extends JPanel{
	
	public Panel_Wait(Btnlistener btn_ear){
		setLocation(0,0);
		setSize(800, 600);
		setLayout(null);
		
		JLabel wait_back=new JLabel(new ImageIcon("src/image/ground.jpg"));
		JLabel wait_text=new JLabel(new ImageIcon("src/image/wait.png"));
		wait_text.setLocation(00,0);
		wait_text.setSize(800,600);
		wait_back.add(wait_text);
		wait_back.setLocation(0,0);
		wait_back.setSize(800,600);
		add(wait_back);
		
		JLabel armow = new JLabel(new ImageIcon("src/image/new_amao_move.gif"));
		armow.setLocation(370, 185);
		armow.setSize(370,370);
		wait_back.add(armow);
		
		setVisible(true);
	}
}
