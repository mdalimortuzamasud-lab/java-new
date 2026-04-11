
package javaapplication21;

import java.util.Scanner;


public class PositiveNagativeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("your enteger number");
        int input=scanner.nextInt();
        int sum=0;
        
        while(input>0){
        sum+=input;
            System.out.println("your integer number");
            input=scanner.nextInt();
        
        }
        scanner.close();
        System.out.println("sum"+sum);
        
    }
            
}
