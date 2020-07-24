import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlayMusic {
	
	static Clip clip;
	static long clipTimePosition;
	
	static File musicPath = new File ("src\\main\\resources\\music.wav");
	
 static void play() throws LineUnavailableException, UnsupportedAudioFileException, IOException {

	  //  try{
	    //	File musicPath = new File (musicLocation);
	    	
	    	if(musicPath.exists())
	    	{	
	      AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
	     clip = AudioSystem.getClip();
	     clip.open(audioInput);
	     clip.start();
	    	}
	    
	// }catch (Exception e) {
	 //     e.printStackTrace();
}

//}
	
 //static void pause() {
	
//clipTimePosition = clip.getMicrosecondPosition();
//clip.stop();
//}
}