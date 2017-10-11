package project;

import java.awt.event.MouseListener;
import java.util.Timer;
import java.awt.event.MouseEvent;

public class Btnlistener_food implements MouseListener{
	
	private Btn_food btn;
	
	public Btnlistener_food(Btn_food btn){
		this.btn = btn;
	}
	
	public void mouseClicked(MouseEvent e){
		
	}
	public void mousePressed(MouseEvent e){
		btn.setIcon(btn.food_icon_B);
	}
	public void mouseReleased(MouseEvent e){
		btn.setIcon(btn.food_icon_A);
	}
	public void mouseEntered(MouseEvent e){
		// when mouse hovering on the btn, then create + - button
		e.getComponent().getParent().add(btn.btn_add); // add button into the mother panel
		btn.btn_add.setLocation(e.getComponent().getX()+140,e.getComponent().getY()); // set location near the add_to_cart btn
		btn.btn_add.setVisible(true);
		
		e.getComponent().getParent().add(btn.btn_sub);
		btn.btn_sub.setLocation(e.getComponent().getX()+140,e.getComponent().getY()+33);
		btn.btn_sub.setVisible(true);
		
		((Btn_food)e.getComponent()).state = true;
	}
	public void mouseExited(MouseEvent e){
		// let add and sub btn disappear after the mouse leaving the addCart btn 0.5 sec
		if( ((Btn_food)e.getComponent()).state == true ){
			Timer timer = new Timer();
			timer.schedule(((Btn_food)e.getComponent()).new Set_addOrSub_invisible(), 700);
		}

	}
}
