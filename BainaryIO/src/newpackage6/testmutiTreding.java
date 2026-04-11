
package newpackage6;

import newpackage4.testmultitrading1;


public class testmutiTreding {
    public static void main(String[] args) {
        Runnable printA=new testmultitrading1('Q', 20);
        Runnable printB=new testmultitrading1('W', 20);
        Runnable printC=new testmultitrading1('E', 20);
        
        Thread t1=new Thread(printA);
        Thread t2=new Thread(printB);
        Thread t3=new Thread(printC);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
