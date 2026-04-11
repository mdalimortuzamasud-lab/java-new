
package newpackage5;

/**
 *
 * @author HP-PC
 */
public class TestMutitreading {
    public static void main(String[] args) {
        Runnable printA=new numan('n', 20);
        Runnable printB=new numan('m', 20);
        Runnable printc=new numan('o', 20);
        
        Thread d1=new Thread(printA);
        Thread d2=new Thread(printB);
        Thread d3=new Thread(printc);
        
        d1.start();
        d2.start();
        d3.start();
        
        
    }
}
