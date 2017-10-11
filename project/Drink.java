package project;


import java.awt.Color;
import javax.swing.JPanel;

public class Drink extends JPanel{
	
	Btn_food drink1, drink2, drink3, drink4, drink5, drink6;
	
	public Drink(){

		drink1 =new Btn_food("<html>暖暖黑糖鮮奶可可", 1, 20, "src/image/drink01.jpg","src/image/drink01_b.jpg");
		drink1.setLocation(30,10);
		drink1.setSize(140,200);
	
		drink2 =new Btn_food("<html>早起的可可", 2, 20, "src/image/drink02.jpg","src/image/drink02_b.jpg");
		drink2.setLocation(250,10);
		drink2.setSize(140,200);
		
		drink3 =new Btn_food("<html>打球很熱的冰豆漿", 3, 20, "src/image/drink03.jpg","src/image/drink03_b.jpg");
		drink3.setLocation(470,10);
		drink3.setSize(140,200);
	
		drink4 =new Btn_food("<html>戀愛毛可可", 4, 25,"src/image/drink04.jpg","src/image/drink04_b.jpg");
		drink4.setLocation(30,230);
		drink4.setSize(140,200);
		
		drink5 =new Btn_food("<html>熱毛可可", 5, 60,"src/image/drink05.jpg","src/image/drink05_b.jpg");
		drink5.setLocation(250,230);
		drink5.setSize(140,200);
		
		drink6 =new Btn_food("<html>咖啡可可", 6, 25,"src/image/drink06.jpg","src/image/drink06_b.jpg");
		drink6.setLocation(470,230);
		drink6.setSize(140,200);
		
		this.add(drink1);
		this.add(drink2);
		this.add(drink3);
		this.add(drink4);
		this.add(drink5);
		this.add(drink6);
		
		this.setBackground(Color.CYAN);
	}
	
	public void setAllText(){
		
		if(Test.c[1]!=null)
			drink1.setText(Test.c[1].name+"$"+Test.c[1].price);
		if(Test.c[2]!=null)
			drink2.setText(Test.c[2].name+"$"+Test.c[2].price);
		if(Test.c[3]!=null)
			drink3.setText(Test.c[3].name+"$"+Test.c[3].price);
		if(Test.c[4]!=null)
			drink4.setText(Test.c[4].name+"$"+Test.c[4].price);
		if(Test.c[5]!=null)
			drink5.setText(Test.c[5].name+"$"+Test.c[5].price);
		if(Test.c[6]!=null)
			drink6.setText(Test.c[6].name+"$"+Test.c[6].price);
		
	}
}