
package javaapplication27;

import java.util.Arrays;
import java.util.Scanner;

public class Babbuleshort {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("give shot length");
        int n=scanner.nextInt();
        int numbers[]=new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("enter your numbers");
            numbers[i]=scanner.nextInt();
        }
        System.out.println("Arrays"+Arrays.toString(numbers));
        
        for(int i=0;i<n-1;i++){
        for(int j=0;i<n-i-1;i++){
        if(numbers[j]>=numbers[j+1]){
        int temp=numbers[j];
        numbers[j]=numbers[j+1];
        numbers[j+1]=temp;
        }
        
        }
            
            
            
            
        }
        
        
        System.out.println("sorter arrrys"+Arrays.toString(numbers));
    }
    
}
