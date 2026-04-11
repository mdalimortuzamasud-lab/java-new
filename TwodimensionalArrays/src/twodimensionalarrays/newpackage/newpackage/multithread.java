/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodimensionalarrays.newpackage.newpackage;

/**
 *
 * @author HP-PC
 */
public class multithread {
    public static void main(String[] args) {
        Runnable printA=new threading('A', 20);
        Runnable printB=new threading('B', 20);
        Runnable printC=new threading('c', 20);
        
        
        Thread t1=new Thread(printA);
        Thread t2=new Thread(printB);
        Thread t3=new Thread(printC);
        t1.start();
        t2.start();
        t3.start();
    }
}
