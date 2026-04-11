/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodimensionalarrys.newpackage;

/**
 *
 * @author HP-PC
 */
public class threading implements Runnable{
    private char CharTOPrint;
    private int times;

    public threading() {
    }

    public threading(char CharTOPrint, int times) {
        this.CharTOPrint = CharTOPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(CharTOPrint+" ");
        }
    }
    
    
}
