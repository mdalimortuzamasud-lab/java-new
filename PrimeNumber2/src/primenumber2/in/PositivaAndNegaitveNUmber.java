
package primenumber2.in;

import java.util.Scanner;


public class PositivaAndNegaitveNUmber {
    public static void main(String[] args) {
        Scanner scanner=new   Scanner(System.in);
        int Input=scanner.nextInt();
        int sum=0;
        
       while(Input>=0){
       sum+=Input;
           System.out.println("entyer your enteger number");
           Input =scanner.nextInt();
           
                   
       } 
        scanner.close();
        System.out.println("sum is"+sum);
    }
}
