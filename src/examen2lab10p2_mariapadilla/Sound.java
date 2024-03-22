/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2lab10p2_mariapadilla;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author belen
 */
public class Sound {
     private Clip clip;
    private String inputFile;
    
    public Sound (String path  ){
        this.inputFile=path;
    
    }
    
        public void run (){
        try{
          File archivo=new File (inputFile);  
          AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(archivo);
          clip=AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
          
          while (!clip.isRunning()){
              Thread.sleep(10);
           
          }
          while (clip.isRunning()){
              Thread.sleep(10);
          
          }
          clip.stop();
          audioInputStream.close();
        
        
        }catch (Exception e){
            e.printStackTrace();
        
        
        }
        return;
        
        
    }
    
    
    
}
