package project;

import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;

public class Btn_food extends JButton{
	
	protected ImageIcon food_icon_A;
	protected ImageIcon food_icon_B;
	
	protected Btn_addOrSubInMenu btn_add;
	protected Btn_addOrSubInMenu btn_sub;
	
	public boolean state; // if add & sub btn is visible
	
	public int which_food;
	public int price;
	public String name;
	public int num;

	
	public Btn_food(String name, int which_food, int price, String food_icon, String food_icon_pressed){
		
		this.food_icon_A = new ImageIcon(food_icon);
		this.food_icon_B = new ImageIcon(food_icon_pressed);
		setIcon(this.food_icon_A);
		
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
		
		this.which_food = which_food;
		this.price = price;
		this.name = name;
		
		this.setText(this.name + "$" + this.price);
		setFont(new Font("º–∑¢≈È",Font.PLAIN,20));
		setVerticalTextPosition(SwingConstants.BOTTOM);
		setHorizontalTextPosition(SwingConstants.CENTER);
		
		this.btn_add = new Btn_addOrSubInMenu(this, 1);
		this.btn_sub = new Btn_addOrSubInMenu(this, -1);
		
		Btnlistener_food btnlisnr_food = new Btnlistener_food(this);
		this.addMouseListener(btnlisnr_food);
		
		state = false; // if add & sub btn is visible
		
	}
	
	public void set_addOrSub_visible(boolean a){
		if(a==true){
			this.btn_add.setVisible(true);
			this.btn_sub.setVisible(true);
			state = true;
			
		}else{
			this.btn_add.setVisible(false);
			this.btn_sub.setVisible(false);
			state = false;
		}
	}
	
	public class Set_addOrSub_invisible extends TimerTask{
		public void run(){
			if(btn_add.state==false && btn_sub.state==false){
				set_addOrSub_visible(false);
			}
		}
	}
	
}
