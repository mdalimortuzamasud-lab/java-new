/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class bainaryio {
    public static void main(String[] args) {
        File file=new File("www.bn");
        
        try {
            FileOutputStream output=new FileOutputStream(file);
            for (int i = 0; i < 10; i++) {
                try {
                    output.write(i);
                } catch (IOException ex) {
                    Logger.getLogger(bainaryio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(bainaryio.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream intput= new FileInputStream(file);
            int value;
            try {
                while ((value=intput.read())!=-1) {
                    System.out.println(value);
                }
            } catch (IOException ex) {
                Logger.getLogger(bainaryio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(bainaryio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
