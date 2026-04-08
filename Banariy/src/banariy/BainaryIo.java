
package banariy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.time.temporal.Temporal;
import java.util.function.BinaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BainaryIo {

   
    public static void main(String[] args) {
        try {
            FileOutputStream output =new  FileOutputStream("C:\\Users\\Admin\\Desktop\\masud (2).dat");
            for (int i = 1; i <= 10; i++) {
                output.write(i);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BainaryIo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BainaryIo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream input=new FileInputStream("C:\\Users\\Admin\\Desktop\\masud (2).dat");
            
            int value;
            while ((value=input.read())!=-1){                
                System.out.println(value+" ");
            }
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BainaryIo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BainaryIo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
    }
    
}
