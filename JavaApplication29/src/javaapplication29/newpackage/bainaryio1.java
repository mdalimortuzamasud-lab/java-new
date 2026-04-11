
package javaapplication29.newpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class bainaryio1 {
    public static void main(String[] args) {
        
    
        try {
            FileOutputStream output= new FileOutputStream("C:\\Users\\HP-PC\\OneDrive\\Desktop\\lll.txt");
            for (int i = 0; i < 10; i++) {
                output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(bainaryio1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(bainaryio1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream input=new FileInputStream("C:\\Users\\HP-PC\\OneDrive\\Desktop\\lll.txt");
            int value;
            while ((value=input.read())!=-1){                
                System.out.println(value+"");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(bainaryio1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(bainaryio1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
}