
package javaapplication17;

import java.util.Scanner;


public class factorial {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int input =scanner.nextInt();
        
        
        int factorial=1;
        for(int i=0;i<=input;i++){
        factorial*=i;
        }
        System.out.println("factorial is "+factorial);
    }
  
}
