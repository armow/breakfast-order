package project;

import java.awt.Color;
import javax.swing.JPanel;

public class Egg extends JPanel{
	
	Btn_food egg1,egg2,egg3,egg4,egg5,egg6;
	
	public Egg(){
	
		egg1 =new Btn_food("<html>°_¥qÁ¦»æ³J»æ", 7, 35,"src/image/egg01.jpg","src/image/egg01_b.jpg");
		egg1.setLocation(30,10);
		egg1.setSize(140,200);
		
		egg2 =new Btn_food("<html>©M­·ÂC³½³J»æ", 8, 30,"src/image/egg02.jpg","src/image/egg02_b.jpg");
		egg2.setLocation(250,10);
		egg2.setSize(140,200);
		
		egg3 =new Btn_food("<html>·sÂA½­µæ³J»æ", 9, 27,"src/image/egg03.jpg","src/image/egg03_b.jpg");
		egg3.setLocation(470,10);
		egg3.setSize(140,200);
		
		egg4 =new Btn_food("<html>­ì¨ý­»½µ³J»æ", 10, 20,"src/image/egg04.jpg","src/image/egg04_b.jpg");
		egg4.setLocation(30,230);
		egg4.setSize(140,200);
		
		egg5 =new Btn_food("<html>ªü¤ò©ÛµP°·±d³J»æ", 11, 60,"src/image/egg05.jpg","src/image/egg05_b.jpg");
		egg5.setLocation(250,230);
		egg5.setSize(140,200);
		
		egg6 =new Btn_food("<html>ªwµæ½Þ±Æ³J»æ", 12, 45,"src/image/egg06.jpg","src/image/egg06_b.jpg");
		egg6.setLocation(470,230);
		egg6.setSize(140,200);
		
		this.add(egg1);
		this.add(egg2);
		this.add(egg3);
		this.add(egg4);
		this.add(egg5);
		this.add(egg6);
		
		this.setBackground(Color.magenta);
	}
	
    public void setAllText(){
		
		if(Test.c[7]!=null)
			egg1.setText(Test.c[7].name+"$"+Test.c[7].price);
		if(Test.c[8]!=null)
			egg2.setText(Test.c[8].name+"$"+Test.c[8].price);
		if(Test.c[9]!=null)
			egg3.setText(Test.c[9].name+"$"+Test.c[9].price);
		if(Test.c[10]!=null)
			egg4.setText(Test.c[10].name+"$"+Test.c[10].price);
		if(Test.c[11]!=null)
			egg5.setText(Test.c[11].name+"$"+Test.c[11].price);
		if(Test.c[12]!=null)
			egg6.setText(Test.c[12].name+"$"+Test.c[12].price);
		
	}
}
