/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodementionalarrays.newpackage;


public class thread implements Runnable{
    private char CharTOPrint;
    private int times;

    public thread() {
    }

    public thread(char CharTOPrint, int times) {
        this.CharTOPrint = CharTOPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(CharTOPrint+" ");
        }
    }
    
    
}
