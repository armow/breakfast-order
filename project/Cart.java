package project;

import java.io.*;

public class Cart implements Serializable{
	
	public String name;
	public int num;
	public int price;
	
	public Cart(){
		
	}
	public Cart(String name,int num,int price){
		this.name=name;		
		this.num=num;
		this.price=price;
	}
	
	
}
