/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage5;

/**
 *
 * @author HP-PC
 */
public class numan implements Runnable{
    private char charToPrint;
    private  int times;

    public numan() {
    }

    public numan(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(charToPrint+" ");
        }
    }
    
    
    
}
