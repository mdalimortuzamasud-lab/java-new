package practice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter masud number");
        int input = scanner.nextInt();
        int sum = 0;

        while (input >= 0) {
            sum += input;
            System.out.println("enter your integr number");
            input = scanner.nextInt();
        }

        scanner.close();
        System.out.println("sum is" + sum);

    }

}
