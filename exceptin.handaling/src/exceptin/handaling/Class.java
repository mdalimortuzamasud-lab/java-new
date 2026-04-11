
package exceptin.handaling;

/**
 *
 * @author HP-PC
 */
public class Class {
    public static void main(String[] args) {
        try {
            int result=10/0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   
}
