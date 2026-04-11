
public class thread implements Runnable{
   
    private char CharToPoint;
    private int times;

    public thread() {
    }

    public thread(char CharToPoint, int times) {
        this.CharToPoint = CharToPoint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(CharToPoint+" ");
        }
    }
    
    
}
