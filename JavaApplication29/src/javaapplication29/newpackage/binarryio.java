
package javaapplication29.newpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class binarryio {
    public static void main(String[] args) {
        
        try {
            FileOutputStream output=new FileOutputStream("C:\\Users\\HP-PC\\OneDrive\\Desktop\\kkk.dat");
            for (int i = 0; i < 10; i++) {
                output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(binarryio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(binarryio.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream input=new FileInputStream("C:\\Users\\HP-PC\\OneDrive\\Desktop\\kkk.dat");
            int value;
            try {                
                while ((value=input.read())!=-1) {
                    System.out.println(value+"");
                }
            } catch (IOException ex) {
                Logger.getLogger(binarryio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(binarryio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
