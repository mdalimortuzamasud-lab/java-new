
package javaapplication28;

import java.util.Arrays;
import java.util.Scanner;


public class JavaApplication28 {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("give length");
        int n =scanner.nextInt();
        int numbers[]=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("enter your number");
            numbers[i]=scanner.nextInt();
        }
        System.out.println("arrys"+Arrays.toString(numbers));
        
        for(int i=0;i<n-1;i++){
        for(int j=0;i<n-1-i;i++){
        if(numbers[j]>=numbers[j+i]){
        int temp=numbers[j];
        numbers[j]=numbers[j+i];
        numbers[j+i]=temp;
        }
        }
        }
        
        System.out.println("sorted arrays"+Arrays.toString(numbers));
        
    }
    
}
