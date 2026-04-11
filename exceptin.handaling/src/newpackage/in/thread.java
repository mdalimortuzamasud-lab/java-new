
package newpackage.in;

public class thread implements Runnable{
    private char CharPoint;
    private int times;

    public thread() {
    }

    public thread(char CharPoint, int times) {
        this.CharPoint = CharPoint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(CharPoint+" ");
        }
    }
    
}
