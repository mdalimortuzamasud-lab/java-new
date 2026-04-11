/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodimensionalarrays.newpackage.newpackage;

/**
 *
 * @author HP-PC
 */
public class threading2 implements Runnable{
    private char CharToPrint;
    private int times;

    public threading2() {
    }

    public threading2(char CharToPrint, int times) {
        this.CharToPrint = CharToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(CharToPrint+" ");
        }
    }
    
}
