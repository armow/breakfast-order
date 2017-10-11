package project;

import javax.swing.*;
import sun.audio.*;
import java.io.*;
import javax.sound.sampled.*;


public class Sound {
	/*
	public static void music(){
		AudioPlayer MGP = AudioPlayer.player;
		AudioStream BGM;
		AudioData MD;
		ContinuousAudioDataStream loop = null;
		
		try{
			System.out.println("playing music");
			BGM = new AudioStream(new FileInputStream("src/image/ding.wav"));
			MD = BGM.getData();
			loop = new ContinuousAudioDataStream(MD);
		}catch(IOException error){
			
		}
		
		MGP.start(loop);
	}
	*/
	public static void playsound(File sound){
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/1000);
		}catch(Exception e){}
	}
}
