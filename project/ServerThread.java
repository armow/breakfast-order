package project;

import java.net.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import sun.audio.*; // 引 入sun.audio 包
import java.net.URL;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class ServerThread implements Runnable{
	
	private Socket socket;  //Server和Client之間的連線通道
	private int num;
	
	public ServerThread(Socket socket, int num){
		this.socket=socket;
		this.num=num;
	}
	public synchronized void run(){  //覆寫Thread內的run()方法
		try{
			//Sound a = new Sound();
			//a.playsound(new File("src/sound/ding.wav"));
			/*
			String bip = "src/sound/ding.wav";
			Media hit = new Media(new File(bip).getClass().getResource("src/sound/ding.wav").toString());
			MediaPlayer mediaPlayer = new MediaPlayer(hit);
			mediaPlayer.play();
			*/
			/*
			AudioPlayer MGP = AudioPlayer.player;
	        AudioStream BGM;
	        AudioData MD;

	        //ContinousAudioDataStream loop = null;

	        try{

	            InputStream test = new FileInputStream("src/sound/ding.wav");
	            BGM = new AudioStream(test);
	            AudioPlayer.player.start(BGM);
	            MD = BGM.getData();
	            //loop = new ContinousAudioDataStream(MD);

	        }catch(FileNotFoundException e){
	            e.printStackTrace();
	        }catch(IOException error){
	            error.printStackTrace();
	        }
	        //MGP.start();
	         * */
	         
			
			/*
			AudioClip plonkSound = new AudioClip("src/sound/ding.wav");
			//plonkSound.play();
			
			
			InputStream in = new FileInputStream ("src/sound/ding.wav");// 

			AudioStream as = new AudioStream(in);// 

			AudioPlayer.player.start(as); //

			//AudioPlayer.player.stop (as);
			*/
			
			
			BufferedReader client_Input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//DataOutputStream clientOutput = new DataOutputStream(connectionSock.getOutputStream());
			ObjectInputStream inFromClient = new ObjectInputStream(socket.getInputStream());

				String clientText = client_Input.readLine(); // should be 1:phone
				
			   Server.client_list.get(num-1).phone = clientText;
			   Server.client_list.get(num-1).food = (Cart[])inFromClient.readObject();
			   Server.client_list.get(num-1).port = this.socket;
			
			
			Server.server_window.clientContainer_in.removeAll();
			Server.server_window.clientContainer_in.setPreferredSize(new Dimension(720, (Server.client_list.size())*110+40));
			int j=0;
			Btnlistener_inServer btnlistener_inServer = new Btnlistener_inServer();
			for(int i=0; i<Server.client_list.size(); ++i){
					++j;
					Panel_clientItem one = new Panel_clientItem(Server.client_list.get(i).which_client, btnlistener_inServer);
					one.setLocation(20,(j-1)*110+20);
					Server.server_window.clientContainer_in.add(one);
			}
			
			Server.server_window.clientContainer.setViewportView(Server.server_window.clientContainer_in);
			
			//client_Input.close();
			//inFromClient.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
