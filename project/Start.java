package project;

import javax.swing.*;


public class Start extends JPanel{
	
	    private Btnlistener btn_ear;
		
	    public Start(Btnlistener btn_ear){
		    setLocation(0,0);
			setSize(800, 600);
			setLayout(null);
			JLabel back= new JLabel(new ImageIcon("src/image/start.jpg"));
		    back.setSize(800,600);
			
			JButton enter =new JButton("進入");
			enter.setLocation(300,280);
			enter.setSize(180,58);
			this.btn_ear = btn_ear;
			enter.addActionListener(this.btn_ear);
			enter.setIcon(new ImageIcon("src/image/want.jpg"));
			
			JButton exit =new JButton("離開");
			exit.setLocation(300,380);
			exit.setSize(180,58);
			this.btn_ear = btn_ear;
			exit.addActionListener(this.btn_ear);
			exit.setIcon(new ImageIcon("src/image/no.jpg"));
			
			JButton question =new JButton("說明");
			question.setLocation(300,480);
			question.setSize(180,58);
			this.btn_ear = btn_ear;
			question.addActionListener(this.btn_ear);
			question.setIcon(new ImageIcon("src/image/how.jpg"));
			add(back);
			back.add(question);
	        back.add(enter);
	        back.add(exit);

	    }
		
}


