package project;

import java.awt.event.MouseListener;
import java.awt.Dimension;
import java.awt.event.MouseEvent;


public class Btnlistener_inCart implements MouseListener{
	public Btnlistener_inCart(){
		
	}
	
	public void mouseClicked(MouseEvent e){
		// which button is pressed : add or sub
		// then change the amount of the food (both for display and attribute)
		if(((Btn_inCart)e.getComponent()).addOrSub > 0){
			// add 1 to the amount of this food in the array record
			++Test.c[((Btn_inCart)e.getComponent()).which_food].num;
			
			// settext + change button num
			((Panel_cartItem)((Btn_inCart)e.getComponent()).getParent()).display_num.setText("计秖: "+Integer.toString (Test.c[((Btn_inCart)e.getComponent()).which_food].num));
			((Panel_cartItem)((Btn_inCart)e.getComponent()).getParent()).display_price.setText("基窥: "+Integer.toString ( Test.c[((Btn_inCart)e.getComponent()).which_food].num * Test.c[((Btn_inCart)e.getComponent()).which_food].price));
			
		}else if(((Btn_inCart)e.getComponent()).addOrSub < 0){
			if(Test.c[((Btn_inCart)e.getComponent()).which_food].num > 0){
				// minus 1 to the amount of this food in the array record
				--Test.c[((Btn_inCart)e.getComponent()).which_food].num;
				((Panel_cartItem)((Btn_inCart)e.getComponent()).getParent()).display_num.setText("计秖: "+Integer.toString (Test.c[((Btn_inCart)e.getComponent()).which_food].num));
				((Panel_cartItem)((Btn_inCart)e.getComponent()).getParent()).display_price.setText("基窥: "+Integer.toString ( Test.c[((Btn_inCart)e.getComponent()).which_food].num * Test.c[((Btn_inCart)e.getComponent()).which_food].price));
			}
		}else{
			// set the food element in the array to zero
			// remove the item in the panel_cart
			Test.c[((Btn_inCart)e.getComponent()).which_food].num=0;
			Panel_cartItem c = (Panel_cartItem)((Btn_inCart)e.getSource()).getParent();
	        c.setVisible(false);
	        Test.cart.itemContainer_in.removeAll();

	        int j=0;
			for(int i=0; i<31; ++i){
				if(Test.c[i]!=null && Test.c[i].num>0){
					++j;
					Panel_cartItem one = new Panel_cartItem(i);
					one.setLocation(20,(j-1)*95+20);
					Test.cart.itemContainer_in.add(one);
				}
			}
			Test.cart.CONTAINER_HEIGHT = (j-1)*120+20;
			Test.cart.itemContainer_in.setPreferredSize(new Dimension(700,Test.cart.CONTAINER_HEIGHT));
			Test.cart.itemContainer.setViewportView(Test.cart.itemContainer_in);
			
		}
		
		Test.c[0].price=0;
	    for(int i=1; i<31; ++i){
			if(Test.c[i]!=null){			
		        Test.c[0].price=Test.c[0].price+Test.c[i].num*Test.c[i].price;
			    Test.cart.sum_display.setText(("Total:"+ Test.c[0].price));
			}
		}
	}
	public void mousePressed(MouseEvent e){
		// change icon when pressed
		if(((Btn_inCart)e.getComponent()).addOrSub > 0){
			((Btn_inCart)e.getComponent()).setIcon(((Btn_inCart)e.getComponent()).addIcon_B);
		}else if(((Btn_inCart)e.getComponent()).addOrSub < 0){
			((Btn_inCart)e.getComponent()).setIcon(((Btn_inCart)e.getComponent()).subIcon_B);
		}else{
			((Btn_inCart)e.getComponent()).setIcon(((Btn_inCart)e.getComponent()).delIcon_B);
		}
	}
	public void mouseReleased(MouseEvent e){
		// change icon when released
		if(((Btn_inCart)e.getComponent()).addOrSub > 0){
			((Btn_inCart)e.getComponent()).setIcon(((Btn_inCart)e.getComponent()).addIcon_A);
		}else if(((Btn_inCart)e.getComponent()).addOrSub < 0){
			((Btn_inCart)e.getComponent()).setIcon(((Btn_inCart)e.getComponent()).subIcon_A);
		}else{
			((Btn_inCart)e.getComponent()).setIcon(((Btn_inCart)e.getComponent()).delIcon_A);
		}
	}
	public void mouseEntered(MouseEvent e){
		
	}
	public void mouseExited(MouseEvent e){
		
		
	}
}
