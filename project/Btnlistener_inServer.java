package project;

import java.awt.event.*;
import java.io.DataOutputStream;
import javax.swing.*;

public class Btnlistener_inServer implements ActionListener{
	public Btnlistener_inServer(){
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("READY")){
			// delete the clientItem and send message to the client
			// then close the connection with the client
			try{
				DataOutputStream serverOutput= new DataOutputStream(Server.client_list.get(((Panel_clientItem)((JButton)e.getSource()).getParent()).which_client).port.getOutputStream());
				serverOutput.writeBytes("go\n");
				((JButton)e.getSource()).setText("FINISH");
				((JButton)e.getSource()).invalidate();
				//Server.client_list.get(((Panel_clientItem)((JButton)e.getSource()).getParent()).which_client).port.close();
				//serverOutput.close();
			}catch(Exception exc){
				exc.printStackTrace();
			}
			
		}else if(e.getActionCommand().equals("check full order")){
			// open the full clientItem to display complete food order of the client
			//((JButton)e.getSource()).setText("hide");
			Frame_display_order order = new Frame_display_order( ((Panel_clientItem)((JButton)e.getSource()).getParent()).which_client); 
		}
		/*else if(e.getActionCommand().equals("hide")){
			// hide the full clientItem to display complete food order of the client
			((JButton)e.getSource()).setText("check full order");
		}
		*/
		else if(e.getActionCommand().equals("FINISH")){
			// hide the full clientItem to display complete food order of the client
			//((JButton)e.getSource()).setText("check full order");
		}else{
			System.out.println("error in btn 'ready' in the server (at btnlistener)");
		}
	}
}
