package project;

import java.awt.*;
import javax.swing.*;

public class Panel_Done extends JPanel{
	private JLabel money;
	
	public Panel_Done(Btnlistener btn_ear){
		setLocation(0,0);
		setSize(800, 600);
		setLayout(null);
		
		JLabel done_back=new JLabel(new ImageIcon("src/image/ground.jpg"));
		done_back.setLocation(0,0);
		done_back.setSize(800,600);
		add(done_back);
		
		JButton take = new JButton("¨úÀ\");
		take.setIcon(new ImageIcon("src/image/take.jpg"));
		take.setSize(170,50);
		take.setLocation(300,300);
		take.addActionListener(btn_ear);
		done_back.add(take);
		
		JLabel done_text=new JLabel(new ImageIcon("src/image/done.png"));
		done_text.setLocation(0,0);
		done_text.setSize(800,600);
		done_back.add(done_text);
		
		money=new JLabel();
		money.setLocation(450,128);
		money.setSize(100,50);
		money.setFont(new Font("Courier", Font.BOLD, 40));
		done_back.add(money);
		
		setVisible(true);
	}
	public void getmoney(){
		money.setText("$"+Integer.toString(Test.c[0].price));
	}
}
