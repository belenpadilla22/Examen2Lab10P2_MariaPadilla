
package examen2lab10p2_mariapadilla;

import javax.swing.JProgressBar;

public class Hilo1 implements Runnable{
    Carro carro1,carro2;
    JProgressBar barra1;

    public Hilo1() {
    }

    public Hilo1(Carro carro1, Carro carro2, JProgressBar barra1) {
        this.carro1 = carro1;
        this.carro2 = carro2;
        this.barra1 = barra1;
    }

    public Hilo1(JProgressBar barra1) {
        this.barra1 = barra1;
    }
    
    
    

    @Override
    public void run() {
        while (true){
            barra1.setValue(barra1.getValue()+1);
            if (barra1.getValue()==100){
                break;
                
            }
            
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        
    
        }
    }
}

