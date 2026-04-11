/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.in.newpackage;

/**
 *
 * @author HP-PC
 */
public class testmuittreding {
    public static void main(String[] args) {
        Runnable printA=new print('A', 20);
        Runnable printB=new print('B', 20);
        Runnable printC=new print('C', 20);
        
        Thread t1=new Thread(printA);
        Thread t2=new Thread(printB);
        Thread t3=new Thread(printC);
        
        t1.start();
        t2.start();
        t3.start();
        
        
    }
}
