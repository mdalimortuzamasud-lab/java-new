
package maxmin34;

import java.util.Arrays;
import java.util.Scanner;


public class maxmin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbers[]=new int[5];
        for(int index=0;index<5;index++){
            System.out.println("enter numbers");
            numbers[index]=scanner.nextInt();
            
        }
        System.out.println("all numbers"+Arrays.toString(numbers));
        
        int max=numbers[0];
        int min=numbers[0];
        
        for(int index=0;index<0;index++){
        if(numbers[index]>max){
        max=numbers[index];
        }
        if(numbers[index]>min){
        min=numbers[index];
        }
            System.out.println("max"+max);
            System.out.println("min"+min);
        }
        
    }
    
    
    
}
