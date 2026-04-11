
package primenumber2.in2;

import java.util.Scanner;


public class Factorial123 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your fACTORIAL NUMBER");
        int input=scanner.nextInt();
        
        int factorial =1;
                for(int i=1;i<=input;i++){
                factorial*=i;
                
                }
                System.out.println("factorial"+factorial);
    }
}
