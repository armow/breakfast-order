package project;

import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class Server {
	
	static public ArrayList<Client_info> client_list = new ArrayList<Client_info>();
	static public int client_num;
	static public Frame_server server_window;
	
	public static void main(String[] args) {
		//Sound a = new Sound();
		//a.playsound(new File("src/sound/ding.wav"));
		client_num=1;
		server_window = new Frame_server();
		try{
		 ServerSocket serverSock=new ServerSocket(8000); //�إߪ���A�ǤJPort�ð��浥�ݱ����s�u���ʧ@
		 while(true){
			Socket cSock=serverSock.accept(); //���ݦ��A���ݪ��s�u�A�Y���s�u�h�{���@�����b�o��
			ServerThread server = new ServerThread(cSock, client_num);
			Thread serverThread= new Thread(server);
			serverThread.start();
			//System.out.println(Server.client_num-1);
			client_list.add(client_num-1,new Client_info());
			client_list.get(client_num-1).which_client = client_num-1;
			
			client_num++;
		 }
		}catch(IOException e){
			System.out.println("disconnected...");
			e.printStackTrace();
		}
	}

}
