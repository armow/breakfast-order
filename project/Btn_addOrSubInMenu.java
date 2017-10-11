package project;

import javax.swing.*;

public class Btn_addOrSubInMenu extends JButton{
	
	protected ImageIcon addIcon_A = new ImageIcon("src/image/plus.png");
	protected ImageIcon addIcon_B = new ImageIcon("src/image/plus_B.png");
	protected ImageIcon subIcon_A = new ImageIcon("src/image/minus.png");
	protected ImageIcon subIcon_B = new ImageIcon("src/image/minus_B.png");
	
	protected int addOrSub;
	protected boolean state; // if mouse hovering on
	protected int price;
	
	public Btn_food mother;
	
	public Btn_addOrSubInMenu(Btn_food mother, int addOrSub){
		this.mother = mother;
		this.addOrSub = addOrSub;
		this.state = false;
		setSize(32,32);
		
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
		
		if(this.addOrSub>0){
			setIcon(addIcon_A);
		}else{
			setIcon(subIcon_A);
		}
		setVisible(false);
		
		addMouseListener(new Btnlistener_addOrSubInMenu());
	}
}
