package testvahicle222333.newpackage;

import java.util.Scanner;

public class Integer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your integer number");
        int Input = scanner.nextInt();
        int sum = 0;

        while (Input > 0) {
            sum += Input;
            System.out.println("ingter ");
            Input =scanner.nextInt();
           
        }
         scanner.close();
        System.out.println("sum is" + sum);
    }
}
