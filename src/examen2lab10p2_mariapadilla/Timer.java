/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2lab10p2_mariapadilla;

import javax.swing.JLabel;

/**
 *
 * @author belen
 */
public class Timer implements Runnable{
    JLabel tiempo;
   
    
    Thread t;

    public Timer(JLabel tiempo) {
        this.tiempo = tiempo;
        
    }
    

    
    
    

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }

 
    

    public Thread getT() {
        return t;
    }

    public void setT(Thread t) {
        this.t = t;
    }

   

    @Override
    public void run() {
        int segundos=0;
        int minutos=0;
        int cont1=0;
        int cont2=0;
        while(true){
            if (segundos<60){
                cont1++;
                tiempo.setText(cont2+ ":"+ cont1);
            
            }else {
                cont2++;
                cont1=00;
                tiempo.setText(cont1+":"+ cont2);
                
            
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
        
        
        }
      
        
        
    }
    
    
    
    
}
