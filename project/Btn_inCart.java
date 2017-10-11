package project;

import javax.swing.*;

public class Btn_inCart extends JButton{
	
	protected ImageIcon addIcon_A = new ImageIcon("src/image/plus.png");
	protected ImageIcon addIcon_B = new ImageIcon("src/image/plus_B.png");
	protected ImageIcon subIcon_A = new ImageIcon("src/image/minus.png");
	protected ImageIcon subIcon_B = new ImageIcon("src/image/minus_B.png");
	protected ImageIcon delIcon_A = new ImageIcon("src/image/delete.png");
	protected ImageIcon delIcon_B = new ImageIcon("src/image/delete_B.png");
	
	protected int addOrSub;
	protected int which_food;
	

	public Btn_inCart(int addOrSub, int which_food){
		this.which_food = which_food;
		this.addOrSub = addOrSub;
		
		setSize(32,32);
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
		
		if(this.addOrSub>0){
			setIcon(addIcon_A);
		}else if (this.addOrSub<0){
			setIcon(subIcon_A);
		}else{
			setIcon(delIcon_A);
		}
		
		addMouseListener(new Btnlistener_inCart());
	}
}
