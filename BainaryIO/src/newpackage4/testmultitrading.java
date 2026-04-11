/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage4;

/**
 *
 * @author HP-PC
 */
public class testmultitrading {
    public static void main(String[] args) {
       Runnable printA=new testmultitrading1('A', 15);
       Runnable printB=new testmultitrading1('B', 15);
       Runnable printc=new testmultitrading1('c', 15);
        
       Thread t1=new Thread(printA);
       Thread t2=new Thread(printB);
       Thread t3=new Thread(printc);
       
       t1.start();
       t2.start();
       t3.start();
       
    }
}
