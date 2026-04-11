
package javaapplication21;

import java.util.Scanner;


public class JavaApplication21 {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        
        
        int factorial=1;
        for(int i=1;i<=input;i++){
        factorial*=i;
        }
        System.out.println("factorial"+factorial);
    }
    
}
