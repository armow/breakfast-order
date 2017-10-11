package project;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame_check extends JFrame{
	public String phonenum;
	static public JTextField phone;
	
	public Frame_check(Btnlistener btn_ear){
		setTitle("check order");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(350,170);
		
		phone = new JTextField(100);
		phone.setLocation(140,60);
		phone.setSize(200,20);
		
		JButton ok = new JButton("送出");
		ok.setSize(70,30);
		ok.setLocation(160,100);		
		ok.addActionListener(btn_ear);

		JButton cancel = new JButton("取消");
		cancel.setSize(70,30);
		cancel.setLocation(250,100);
		cancel.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{ 
				Frame_check.this.dispose();
			}
			} );
		JLabel enter_num = new JLabel("請輸入你的聯絡電話");
		enter_num.setLocation(10,20);
		enter_num.setSize(200,100);
		enter_num.setFont(new Font("Courier",Font.BOLD,12));
		
		add(ok);
		add(cancel);
		add(phone);
		add(enter_num);
		
		setVisible(false);	
	}

}
