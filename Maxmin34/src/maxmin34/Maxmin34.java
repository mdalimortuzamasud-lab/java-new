package maxmin34;

import java.util.Arrays;
import java.util.Scanner;

public class Maxmin34 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numbers[] = new int[5];

        for (int index = 0; index < 5; index++) {
            System.out.println("enter your number");
            numbers[index] = s.nextInt();
        }
        System.out.println("all numbres" + Arrays.toString(numbers));

        int max = numbers[0];
        int min = numbers[0];

        for (int index = 0; index < 5;index++)
        {
            if (numbers[index] > max) {
                max = numbers[index];
            }
            if (numbers[index] < min) {
                min = numbers[index];
            }

        }
        System.out.println("max" + max);
        System.out.println("min" + min);
    }
}
