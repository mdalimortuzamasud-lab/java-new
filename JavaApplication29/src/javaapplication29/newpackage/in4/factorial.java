
package javaapplication29.newpackage.in4;

import java.util.Scanner;

/**
 *
 * @author HP-PC
 */
public class factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your number");
        int input=scanner.nextInt();
        
        int factorial=1;
        
        for (int i = 1; i <= input; i++) {
            factorial*=i;
        }
        System.out.println("factorial is"+factorial);
        
    }
}
