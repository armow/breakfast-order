package project;

import java.awt.Color;
import javax.swing.JPanel;


public class Other extends JPanel{
	
	Btn_food other1,other2,other3,other4,other5,other6;
	
	public Other(){
		
		other1 =new Btn_food("<html>³Á§JÂû¶ô", 19, 30,"src/image/other01.jpg","src/image/other01_b.jpg");
		other1.setLocation(30,10);
		other1.setSize(140,200);
		
		other2 =new Btn_food("<html>ÅÚ½³¿|¥[³J", 20, 30,"src/image/other02.jpg","src/image/other02_b.jpg");
		other2.setLocation(250,10);
		other2.setSize(140,200);
		
		other3 =new Btn_food("<html>ªü¤ò«ë¼öª¯", 21, 15,"src/image/other03.jpg","src/image/other03_b.jpg");
		other3.setLocation(470,10);
		other3.setSize(140,200);
		
		other4 =new Btn_food("<html>Á¦»æ", 22, 15,"src/image/other04.jpg","src/image/other04_b.jpg");
		other4.setLocation(30,230);
		other4.setSize(140,200);
		
		other5 =new Btn_food("<html>¥¤­»¥É¦Ì¿@´ö", 23, 25, "src/image/other05.jpg","src/image/other05_b.jpg");
		other5.setLocation(250,230);
		other5.setSize(140,200);
		
		other6 =new Btn_food("<html>ªü¤ò©ÛµP²ü¥]³J", 24, 60,"src/image/other06.jpg","src/image/other06_b.jpg");
		other6.setLocation(470,230);
		other6.setSize(140,200);
		
		this.add(other1);
		this.add(other2);
		this.add(other3);
		this.add(other4);
		this.add(other5);
		this.add(other6);
		
		this.setBackground(Color.green);
	}
    public void setAllText(){
		
		if(Test.c[19]!=null)
			other1.setText(Test.c[19].name+"$"+Test.c[19].price);
		if(Test.c[20]!=null)
			other2.setText(Test.c[20].name+"$"+Test.c[20].price);
		if(Test.c[21]!=null)
			other3.setText(Test.c[21].name+"$"+Test.c[21].price);
		if(Test.c[22]!=null)
			other4.setText(Test.c[22].name+"$"+Test.c[22].price);
		if(Test.c[23]!=null)
			other5.setText(Test.c[23].name+"$"+Test.c[23].price);
		if(Test.c[24]!=null)
			other6.setText(Test.c[24].name+"$"+Test.c[24].price);
		
	}
}