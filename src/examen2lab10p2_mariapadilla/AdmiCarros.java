
package examen2lab10p2_mariapadilla;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdmiCarros {
      ArrayList<Carro>carros=new ArrayList();
     File archivo=null;

    public AdmiCarros() {
    }
     
      public AdmiCarros(String Path) {
        archivo=new File(Path);
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
      
      public void CargarArchivo (){
         try {
             carros=new ArrayList();
             Carro temp;// limpiar memoria RAM
             if (archivo.exists()){// si existe 
                 FileInputStream entrada=new FileInputStream(archivo);
                 ObjectInputStream objeto=new ObjectInputStream(entrada);
                 try {
                     while ((temp=(Carro)objeto.readObject())!=null){
                          carros.add(temp);
                     }
                 } catch (EOFException e) {
                   
                 }
                 objeto.close();
                 entrada.close();
             
             }
         } catch (Exception ex) {
             ex.printStackTrace();
         }
     
     
     }
     public void EscribirArchivo (){
         FileOutputStream fw=null;
         ObjectOutputStream bw=null;
         try {
             fw=new FileOutputStream(archivo);
             bw=new ObjectOutputStream(fw);
             for (Carro t : carros) {
                 bw.writeObject(t);
             }
             bw.flush();
             
         } catch (Exception e) {
         }finally {
             try {
                 bw.close();
                 fw.close();
             } catch (Exception e) {
             }
         
         }
     
     
     }  

}
