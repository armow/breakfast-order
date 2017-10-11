package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panel_Menu extends JPanel{
	static Drink drink;
	static Egg egg;
	static Ham ham;
	static Other other;
	static Toast toast;
	
	public Panel_Menu(Btnlistener btn_ear){
		
		setLocation(0,0);
		setSize(800, 600);
		setLayout(null);
		JLabel back= new JLabel(new ImageIcon("src/image/ground.jpg"));
	    back.setSize(800,600);
	    add(back);

		JLabel title = new JLabel("MENU");
		title.setIcon(new ImageIcon("src/image/menu.png"));
		title.setLocation(0, 8);
		title.setSize(150, 50);
		title.setFont(new Font("Courier", Font.BOLD, 28));
		title.setForeground(Color.blue);
		
		back.add(title);
		
		JButton shopcar = new JButton("my cart");
		shopcar.setBorder(null);
		shopcar.setContentAreaFilled(false);
		shopcar.setOpaque(false);
		shopcar.setBackground(new Color(0,0,0));
		shopcar.setIcon(new ImageIcon("src/image/car1.png"));
		shopcar.setLocation(660, 400);
		shopcar.setSize(120,150);
		shopcar.addActionListener(btn_ear);
		shopcar.setFont(new Font("Courier", Font.BOLD, 18));
		shopcar.setForeground(Color.blue);

		ham= new Ham();
		ham.setBounds(8,80,650,450); 
		ham.setLayout(null);
		back.add(ham);
		ham.setVisible(false);
		
		toast= new Toast();
		toast.setBounds(8,80,650,450); 
		toast.setLayout(null);
		back.add(toast);
		toast.setVisible(false);
		
		drink= new Drink();
		drink.setBounds(8,80,650,450); 
		drink.setLayout(null);
		back.add(drink);
		drink.setVisible(false);
		
		egg= new Egg();
		egg.setBounds(8,80,650,450); 
		egg.setLayout(null);
		back.add(egg);
		egg.setVisible(false);
		
		other= new Other();
		other.setBounds(8,80,650,450); 
		other.setLayout(null);
		back.add(other);
		other.setVisible(false);
		
		JButton type1 =new JButton("漢堡");
		type1.setIcon(new ImageIcon("src/image/type1.jpg"));
		type1.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{ 
				ham.setVisible(true);
				toast.setVisible(false);
				egg.setVisible(false);
				drink.setVisible(false);
				other.setVisible(false);
			}
			} );
		type1.setLocation(160,10);
		type1.setSize(70,50);
		type1.setFont(new Font("標楷體",Font.PLAIN,20));
		
		JButton type2 =new JButton("吐司");
		type2.setIcon(new ImageIcon("src/image/type2.jpg"));
		type2.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{ 
				ham.setVisible(false);
				toast.setVisible(true);
				egg.setVisible(false);
				drink.setVisible(false);
				other.setVisible(false);
			}
			} );
		type2.setLocation(280,10);
		type2.setSize(70,50);
		type2.setFont(new Font("標楷體",Font.PLAIN,20));
		
		JButton type3 =new JButton("蛋餅");
		type3.setIcon(new ImageIcon("src/image/type3.jpg"));
		type3.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{ 
				ham.setVisible(false);
				toast.setVisible(false);
				egg.setVisible(true);
				drink.setVisible(false);
				other.setVisible(false);
			}
			} );
		type3.setLocation(400,10);
		type3.setSize(70,50);
		type3.setFont(new Font("標楷體",Font.PLAIN,20));
		
		JButton type4 =new JButton("飲料");
		type4.setIcon(new ImageIcon("src/image/type4.jpg"));
		type4.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{ 
				ham.setVisible(false);
				toast.setVisible(false);
				egg.setVisible(false);
				drink.setVisible(true);
				other.setVisible(false);
			}
			} );
		type4.setLocation(520,10);
		type4.setSize(70,50);
		type4.setFont(new Font("標楷體",Font.PLAIN,20));
		
		JButton type5 =new JButton("中式餐點");
		type5.setIcon(new ImageIcon("src/image/type5.jpg"));
		type5.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{ 
				ham.setVisible(false);
				toast.setVisible(false);
				egg.setVisible(false);
				drink.setVisible(false);
				other.setVisible(true);
			}
			} );
		type5.setLocation(640,10);
		type5.setSize(120,50);
		type5.setFont(new Font("標楷體",Font.PLAIN,20));
		
		
		back.add(type1);
		back.add(type2);
		back.add(type3);
		back.add(type4);
		back.add(type5);
		back.add(shopcar);
		setLayout(null);
		setVisible(true);
	}
}



