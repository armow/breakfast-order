package project;
import java.awt.Color;
import javax.swing.JPanel;

public class Ham extends JPanel{
	
	Btn_food ham1,ham2,ham3,ham4,ham5,ham6;
	
	public Ham(){
	
	ham1 =new Btn_food("<html>新鮮蔬菜堡", 13, 30,"src/image/ham01.jpg","src/image/ham01_b.jpg");
	ham1.setLocation(30,10);
	ham1.setSize(140,200);
	
	ham2 =new Btn_food("<html>起司牛肉堡", 14, 40,"src/image/ham02.jpg","src/image/ham02_b.jpg");
	ham2.setLocation(250,10);
	ham2.setSize(140,200);

	ham3 =new Btn_food("<html>海味鮮蝦堡", 15, 40,"src/image/ham03.jpg","src/image/ham03_b.jpg");
	ham3.setLocation(470,10);
	ham3.setSize(140,200);

	ham4 =new Btn_food("<html>泰式雞腿堡", 16, 45,"src/image/ham04.jpg","src/image/ham04_b.jpg");
	ham4.setLocation(30,230);
	ham4.setSize(140,200);

	ham5 =new Btn_food("<html>BBQ雙層牛肉堡", 17, 50,"src/image/ham05.jpg","src/image/ham05_b.jpg");
	ham5.setLocation(250,230);
	ham5.setSize(140,200);

	ham6 =new Btn_food("<html>阿毛招牌蛋堡", 18, 60,"src/image/ham06.jpg","src/image/ham06_b.jpg");
	ham6.setLocation(470,230);
	ham6.setSize(140,200);
	
	this.add(ham1);
	this.add(ham2);
	this.add(ham3);
	this.add(ham4);
	this.add(ham5);
	this.add(ham6);
	
	this.setBackground(Color.YELLOW);

	}
    public void setAllText(){
		
		if(Test.c[13]!=null)
			ham1.setText(Test.c[13].name+"$"+Test.c[13].price);
		if(Test.c[14]!=null)
			ham2.setText(Test.c[14].name+"$"+Test.c[14].price);
		if(Test.c[15]!=null)
			ham3.setText(Test.c[15].name+"$"+Test.c[15].price);
		if(Test.c[16]!=null)
			ham4.setText(Test.c[16].name+"$"+Test.c[16].price);
		if(Test.c[17]!=null)
			ham5.setText(Test.c[17].name+"$"+Test.c[17].price);
		if(Test.c[18]!=null)
			ham6.setText(Test.c[18].name+"$"+Test.c[18].price);
		
	}	
	
}