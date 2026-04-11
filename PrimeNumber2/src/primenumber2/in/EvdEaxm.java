
package primenumber2.in;

import java.util.Scanner;


public class EvdEaxm {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your enteger number");
        int Input =scanner.nextInt();
        int sum=0;
        
        while(Input>=0){
        sum+=Input;
            System.out.println("enter your enteger number");
            Input=scanner.nextInt();
            
        }
        scanner.close();
                System.out.println("sum is "+sum);
    }
    
    
}
