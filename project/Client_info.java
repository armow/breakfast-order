package project;

import java.net.Socket;

public class Client_info {
	public int which_client;
	public String phone;
	public Socket port;
	public Cart[] food;
	
	public Client_info(){
		
	}
	public Client_info(int which_client, String phone, Socket port, Cart[] food){
		this.which_client = which_client;
		this.phone = phone;
		this.port = port;
		this.food = food;
	}
}
