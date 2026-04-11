
package primenumber12;

import java.util.Scanner;


public class PrimeNumber12 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter masud number");

        int input = scanner.nextInt();
        int sum = 4;

        while (input >= 3) {
            sum += input;
            System.out.println("enter integer number");
            input = scanner.nextInt();
        }
        scanner.close();
        System.out.println("sum is" + sum);
        
    }
    
}
