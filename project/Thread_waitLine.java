package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thread_waitLine extends Thread{
	public Thread_waitLine(){
		
	}
	public void run(){
		//Test.btnlisnr.connectionSock
		
		try{
			BufferedReader serverReady= new BufferedReader(new InputStreamReader(Test.btnlisnr.connectionSock.getInputStream()));
			String ready=serverReady.readLine();
			if(ready.equals("go"))
				Test.btnlisnr.cardLayoutTmp.show(Test.btnlisnr.cardPanelTmp,"5");
				Test.done.getmoney();
			//connectionSock.close();
			//serverOutput.close();
			//outToServer.close();
			
		    
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
