
package twodementionalarrays.newpackage;

public class multithreading {
    public static void main(String[] args) {
        Runnable printA=new thread('A', 20);
        Runnable printB=new thread('B', 20);
        Runnable printC=new thread('C', 20);
         
        Thread t1=new Thread(printA);
        Thread t2=new Thread(printB);
        Thread t3=new Thread(printC);
        
        t1.start();
        t2.start();
        t3.start();
        
    }
    
    
}
