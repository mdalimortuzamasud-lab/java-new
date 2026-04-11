
package newpackage2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Bainarylo {
    public static void main(String[] args) {
        
        File file =new File("next.dat");
        try {
            FileOutputStream output=new FileOutputStream(file);
            for (int i = 0; i < 10; i++) {
                try {
                    output.write(i);
                } catch (IOException ex) {
                    Logger.getLogger(Bainarylo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bainarylo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream input=new FileInputStream(file);
            int value;
            try {
                while ((value=input.read())!=-1) {
                    System.out.println(value);
                }
            } catch (IOException ex) {
                Logger.getLogger(Bainarylo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bainarylo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
