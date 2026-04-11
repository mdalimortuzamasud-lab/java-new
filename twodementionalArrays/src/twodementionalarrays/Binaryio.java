
package twodementionalarrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Binaryio {
    
    
    public static void main(String[] args) {
      File file=new File("hello.dat");
        
        try {
            FileOutputStream n=new FileOutputStream(file);
            for (int i = 0; i < 10; i++) {
                try {
                    n.write(i);
                } catch (IOException ex) {
                    Logger.getLogger(Binaryio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    
                    } catch (FileNotFoundException ex) {
            Logger.getLogger(Binaryio.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream input=new FileInputStream(file);
            int value;
          try {
              while ((value=input.read())!=-1) {
                  System.out.println(value);
              }
          } catch (IOException ex) {
              Logger.getLogger(Binaryio.class.getName()).log(Level.SEVERE, null, ex);
          }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Binaryio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
