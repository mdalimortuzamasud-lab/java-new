/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage6;

/**
 *
 * @author HP-PC
 */
public class Testmultitreading2 implements Runnable{
    private  char charToPrint;
    private int times;

    public Testmultitreading2() {
    }

    public Testmultitreading2(char charToPrint, int times) {
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
