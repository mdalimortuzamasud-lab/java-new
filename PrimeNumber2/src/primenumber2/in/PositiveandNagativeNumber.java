
package primenumber2.in;

import java.util.Scanner;



public class PositiveandNagativeNumber {
    public static void main(String[] args) {
        Scanner scanner=new  Scanner(System.in);
        System.out.println("integer");
        int Input=scanner.nextInt();
        int sum=0;
        while(Input>=0){
            sum+=Input;
            System.out.println("enter your integer number");
             Input=scanner.nextInt();
             
        }
        scanner.close();
        System.out.println("sum is"+sum);
        
    }
    
 
}
