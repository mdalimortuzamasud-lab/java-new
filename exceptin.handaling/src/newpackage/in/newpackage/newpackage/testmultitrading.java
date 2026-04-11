/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.in.newpackage.newpackage;

/**
 *
 * @author HP-PC
 */
public class testmultitrading {
    public static void main(String[] args) {
      Runnable p1=new treading();
      Runnable p2=new threading1();
     
        
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        
        
        t1.start();
        t2.start();
        
        
        
    }
}
