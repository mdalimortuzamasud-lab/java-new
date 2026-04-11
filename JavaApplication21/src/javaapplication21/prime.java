
package javaapplication21;

import java.util.Scanner;


public class prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input =scanner.nextInt();
        int count=0;
        
        for(int i =1;i<=5;i++){
        if(input%i==0){
        count++;
        }
        }
        
        if(count<=2){
            System.out.println("prime number");
        }else{
            System.out.println("not prime");
        }
        
    }
}
