package project;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Toast extends JPanel{
	
	Btn_food toast1,toast2,toast3,toast4,toast5,toast6;
	
	public Toast(){		
	
		toast1 =new Btn_food("<html>·Î³J¦R¥q", 25, 20,"src/image/toast01.jpg","src/image/toast01_b.jpg");
		toast1.setLocation(30,10);
		toast1.setSize(140,200);	
	
		toast2 =new Btn_food("<html>¥_®ü÷«³½¦R¥q",26, 35,"src/image/toast02.jpg","src/image/toast02_b.jpg");
		toast2.setLocation(250,10);
		toast2.setSize(140,200);
			
		toast3 =new Btn_food("<html>¦×³J¦R¥q", 27, 35,"src/image/toast03.jpg","src/image/toast03_b.jpg");
		toast3.setLocation(470,10);
		toast3.setSize(140,200);
			
		toast4 =new Btn_food("<html>·ÏÂtÂû¦×¦R¥q", 28, 30,"src/image/toast04.jpg","src/image/toast04_b.jpg");
		toast4.setLocation(30,230);
		toast4.setSize(140,200);
		
		toast5 =new Btn_food("<html>Á¦ªd¨F©Ô¦R¥q", 29, 30,"src/image/toast05.jpg","src/image/toast05_b.jpg");
		toast5.setLocation(250,230);
		toast5.setSize(140,200);
		
		toast6 =new Btn_food("<html>ªü¤ò©ÛµP½­µæ³J¦R¥q", 30, 60, "src/image/toast06.jpg","src/image/toast06_b.jpg");
		toast6.setLocation(470,230);
		toast6.setSize(145,200);
		
		this.add(toast1);
		this.add(toast2);
		this.add(toast3);
		this.add(toast4);
		this.add(toast5);
		this.add(toast6);
		
		this.setBackground(Color.ORANGE);
	}
    public void setAllText(){
		
		if(Test.c[25]!=null)
			toast1.setText(Test.c[25].name+"$"+Test.c[25].price);
		if(Test.c[26]!=null)
			toast2.setText(Test.c[26].name+"$"+Test.c[26].price);
		if(Test.c[27]!=null)
			toast3.setText(Test.c[27].name+"$"+Test.c[27].price);
		if(Test.c[28]!=null)
			toast4.setText(Test.c[28].name+"$"+Test.c[28].price);
		if(Test.c[29]!=null)
			toast5.setText(Test.c[29].name+"$"+Test.c[29].price);
		if(Test.c[30]!=null)
			toast6.setText(Test.c[30].name+"$"+Test.c[30].price);
		
	}
}