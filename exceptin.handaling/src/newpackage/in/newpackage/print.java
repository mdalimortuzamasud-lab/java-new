/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.in.newpackage;

/**
 *
 * @author HP-PC
 */
public class print implements Runnable{
    private char ChartoPrint;
    private  int times;

    public print() {
    }

    public print(char ChartoPrint, int times) {
        this.ChartoPrint = ChartoPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(ChartoPrint+" ");
        }
    }
    
}
