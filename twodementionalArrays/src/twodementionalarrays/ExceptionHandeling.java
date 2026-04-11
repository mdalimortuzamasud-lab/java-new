
package twodementionalarrays;


public class ExceptionHandeling {
    public static void main(String[] args) {
        try {
            int result=10/0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("integer can not be divided by zero");
        }
        
        
    }
    
    
}
