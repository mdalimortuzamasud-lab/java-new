
package primenumber2.in;

import java.util.Scanner;


public class PositvieAndN {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("integer");
        int input =scanner.nextInt();
        int sum=0;
        
            while(input>=0){
            sum+=input;
             System.out.println("interger");
            input=scanner.nextInt();
            
            }
            scanner.close();
            System.out.println("sum is"+sum);
    }
  
}
