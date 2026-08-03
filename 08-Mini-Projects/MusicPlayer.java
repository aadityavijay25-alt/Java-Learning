import java.util.*;

import javax.sound.sampled.*;
// import javax.sound.sampled.AudioInputStream;
// import javax.sound.sampled.AudioSystem;
// import javax.sound.sampled.Clip;
// import javax.sound.sampled.LineUnavailableException;
// import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.*;
public class MusicPlayer {
    public static void main(String[] args) {

        String filePath = "08-Mini-Projects\\Daytime Forest Bonfire.wav";
        File file = new File(filePath);

        try(Scanner sc = new Scanner(System.in);
              AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String reponse = "";
            while(!reponse.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                reponse = sc.nextLine().toUpperCase();
                clip.start();
                switch(reponse){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid");
                 }
            }
            
            
        }

        catch(FileNotFoundException e){
            System.out.println("Could not locate file");

        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        
    }
    
}
