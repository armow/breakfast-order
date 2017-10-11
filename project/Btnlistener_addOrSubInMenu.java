package project;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


public class Btnlistener_addOrSubInMenu implements MouseListener{
	
	public Btnlistener_addOrSubInMenu(){	
	}

	public void mouseClicked(MouseEvent e){
		// which button is pressed : add or sub
		
		Test.c[((Btn_addOrSubInMenu)e.getComponent()).mother.which_food]=new Cart(((Btn_addOrSubInMenu)e.getComponent()).mother.name, (((Btn_addOrSubInMenu)e.getComponent()).mother.num), ((Btn_addOrSubInMenu)e.getComponent()).mother.price);
		((Btn_addOrSubInMenu)e.getComponent()).mother.num=Test.c[((Btn_addOrSubInMenu)e.getComponent()).mother.which_food].num;
		
		if(((Btn_addOrSubInMenu)e.getComponent()).addOrSub>0){
			++Test.c[((Btn_addOrSubInMenu)e.getComponent()).mother.which_food].num;
			((Btn_addOrSubInMenu)e.getComponent()).mother.num=Test.c[((Btn_addOrSubInMenu)e.getComponent()).mother.which_food].num;
		}else{
			if(((Btn_addOrSubInMenu)e.getComponent()).mother.num>0){
				--Test.c[((Btn_addOrSubInMenu)e.getComponent()).mother.which_food].num;
				((Btn_addOrSubInMenu)e.getComponent()).mother.num=Test.c[((Btn_addOrSubInMenu)e.getComponent()).mother.which_food].num;
		
			}
		}
		
		//((Btn_addOrSubInMenu)e.getComponent()).mother.setText( Test.c[((Btn_addOrSubInMenu)e.getComponent()).mother.which_food ].name+"$"+Integer.toString( Test.c[((Btn_addOrSubInMenu)e.getComponent()).mother.which_food ].price)+" x"+Test.c[((Btn_addOrSubInMenu)e.getComponent()).mother.which_food ].num);
	}
	public void mousePressed(MouseEvent e){
		if(((Btn_addOrSubInMenu)e.getComponent()).addOrSub>0){
			((Btn_addOrSubInMenu)e.getComponent()).setIcon(((Btn_addOrSubInMenu)e.getComponent()).addIcon_B);
		}else{
			((Btn_addOrSubInMenu)e.getComponent()).setIcon(((Btn_addOrSubInMenu)e.getComponent()).subIcon_B);
		}
	}
	public void mouseReleased(MouseEvent e){
		if(((Btn_addOrSubInMenu)e.getComponent()).addOrSub>0){
			((Btn_addOrSubInMenu)e.getComponent()).setIcon(((Btn_addOrSubInMenu)e.getComponent()).addIcon_A);
		}else{
			((Btn_addOrSubInMenu)e.getComponent()).setIcon(((Btn_addOrSubInMenu)e.getComponent()).subIcon_A);
		}
	}
	public void mouseEntered(MouseEvent e){
		((Btn_addOrSubInMenu)e.getComponent()).state = true;
	}
	public void mouseExited(MouseEvent e){
		((Btn_addOrSubInMenu)e.getComponent()).state = false;
		if(((Btn_addOrSubInMenu)e.getComponent()).mother.state == true) ((Btn_addOrSubInMenu)e.getComponent()).mother.set_addOrSub_visible(false);
	}
}
