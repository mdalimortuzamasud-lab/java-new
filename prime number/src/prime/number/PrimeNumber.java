package prime.number;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= userInput; i++) {

            if (userInput % i == 0) {
                count++;

            }
        }
        if (count == 3) {
            System.out.println("enter your prime number");

        } else {

            System.out.println("enter your not prime number");
        }

    }

}
