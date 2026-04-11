/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodementionalarrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP-PC
 */
public class binaryio1 {
    public static void main(String[] args) {
        
        File file=new File("book.dat");
        
        try {
            FileOutputStream output=new FileOutputStream(file);
            for (int i = 0; i < 10; i++) {
                try {
                    output.write(i);
                } catch (IOException ex) {
                    Logger.getLogger(binaryio1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(binaryio1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream m=new FileInputStream(file);
            int numbers;
            try {
                while ((numbers=m.read())!=-1) {
                    System.out.println(numbers);
                }
            } catch (IOException ex) {
                Logger.getLogger(binaryio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(binaryio1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
