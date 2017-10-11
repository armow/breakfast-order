package project;

import javax.swing.*;
import java.awt.*;

public class Panel_cartItem extends JPanel{
	
//	private String name;
//	private int num;
//	private int price;
	private int which_food;
	
	JLabel display_name;
	JLabel display_num;
	JLabel display_price;
	
	protected Btn_addOrSubInMenu btn_add;
	protected Btn_addOrSubInMenu btn_sub;
	protected Btn_addOrSubInMenu btn_delete;
	
	public Panel_cartItem(int which_food){
		setSize(680, 80);
		setBackground(Color.white);
		setLayout(null);
		
		//this.name = name;
		//this.num = num;
		//this.price = price;
		this.which_food = which_food;
		
		display_name = new JLabel(Test.c[this.which_food].name);
		display_name.setLocation(16,7);
		display_name.setSize(150,70);
		display_name.setFont(new Font("標楷體", Font.PLAIN, 25));
		display_num = new JLabel("數量: "+Test.c[this.which_food].num);
		display_num.setLocation(350,10);
		display_num.setSize(130,70);
		display_num.setFont(new Font("標楷體", Font.PLAIN, 25));
		//display_num..setForeground(Color.red);
		display_price = new JLabel("價錢: "+Test.c[this.which_food].num*Test.c[this.which_food].price);
		display_price.setLocation(490,10);
		display_price.setSize(150,70);
		display_price.setFont(new Font("標楷體", Font.PLAIN, 25));
		
		
		
		Btn_inCart btn_add = new Btn_inCart(1,this.which_food);
		btn_add.setLocation(180,30);
		Btn_inCart btn_sub = new Btn_inCart(-1,this.which_food);
		btn_sub.setLocation(220,30);
		Btn_inCart btn_delete = new Btn_inCart(0,this.which_food);
		btn_delete.setLocation(260,30);
		
		add(display_name);
		
		add(btn_add);
		add(btn_sub);
		add(btn_delete);
		
		add(display_num);
		add(display_price);
	}
}
