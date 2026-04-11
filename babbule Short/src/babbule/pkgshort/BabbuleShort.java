
package babbule.pkgshort;

import java.util.Arrays;
import java.util.Scanner;

public class BabbuleShort {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("give array length");
        int n =scanner.nextInt();
        int numbers[]=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("enter your number");
            numbers[i]=scanner.nextInt();  
            
        }
        System.out.println("arrays"+Arrays.toString(numbers));
        
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (numbers[j]>=numbers[j+1]) {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                  numbers[j+1]= temp;
            }
        }
        
        }
        System.out.println("sorter arrys"+Arrays.toString(numbers)); 
    }
    
}
