package ie.itsligo.roomroute;


import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class QRSound{
	public static final int GOTO_ENGINEERING =1;// Go to engineering message
	public static final int GOTO_MAIN =2;
	public static final int GOTO_BUSINESS =3;
	public static final int GOTO_F =4;
	public static final int GOTO_C =5;
	public static final int GOTO_SCIENCE =6;
	public static final int GOTO_SORRY =7;
	public static void main(String[] args){
		
		playit(GOTO_ENGINEERING);
		delayfor(15);
		playit(GOTO_MAIN);
		delayfor(15);
		playit(GOTO_BUSINESS);
		delayfor(15);
		playit(GOTO_F);
		delayfor(15);
		playit(GOTO_C);
		delayfor(15);
		playit(GOTO_SCIENCE);
		delayfor(15);
		playit(GOTO_SORRY);
		delayfor(15);
		// delay for 15 seconds
	}
	
	public static void delayfor(int n)
	{
		try{
		Thread.sleep(n *1000);//1000 milliseconds is one second.
		}catch(InterruptedException ex){
		Thread.currentThread().interrupt();
		}
	}
/*
	 * Method is passed a sound flag it will play that sound there is only one
	 * currently supported. To use this sound - call new playit(SOUND);
	 */
	public static void playit(int soundRequired){
		String fn=null;
		File sound;
        URL location =QRSound.class.getProtectionDomain().getCodeSource().getLocation();

		
		switch(soundRequired){
		case GOTO_ENGINEERING:
			System.out.println("location.getFile():" + location.getFile());
			//fn=location.getFile()+"../src/resources/engineering.wav";
			fn = "C:/Users/Emma/Documents/engineering.wav";
			break;
		case GOTO_MAIN:
			System.out.println("location.getFile():" + location.getFile());
			//fn=location.getFile()+"../src/resources/main.wav";
			fn = "C:/Users/Emma/Documents/Main.wav";
			break;
		case GOTO_BUSINESS:
			System.out.println("location.getFile():" + location.getFile());
			//fn=location.getFile()+"../src/resources/main.wav";
			fn = "C:/Users/Emma/Documents/Business.wav";
			break;
		
		case GOTO_C:
			System.out.println("location.getFile():" + location.getFile());
			//fn=location.getFile()+"../src/resources/main.wav";
			fn = "C:/Users/Emma/Documents/C.wav";
			break;
		case GOTO_F:
			System.out.println("location.getFile():" + location.getFile());
			//fn=location.getFile()+"../src/resources/main.wav";
			fn = "C:/Users/Emma/Documents/F.wav";
			break;
		case GOTO_SCIENCE:
			System.out.println("location.getFile():" + location.getFile());
			//fn=location.getFile()+"../src/resources/main.wav";
			fn = "C:/Users/Emma/Documents/Science.wav";
			break;
		case GOTO_SORRY:
			System.out.println("location.getFile():" + location.getFile());
			//fn=location.getFile()+"../src/resources/main.wav";
			fn = "C:/Users/Emma/Documents/Sorry.wav";
			break;
		default:
			break;

		}

		// Go for it!
		try{
			// Open an audio input stream.
			sound=new File(fn);
			AudioInputStreamaudioIn=AudioSystem.getAudioInputStream(sound);
			Clip clip=AudioSystem.getClip();
			// Open audio clip and load samples from the audio input stream.
			clip.open(audioIn);
			clip.start();
			// plays
		}catch(UnsupportedAudioFileException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(LineUnavailableException e){
			e.printStackTrace();
		}catch(Throwable e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
