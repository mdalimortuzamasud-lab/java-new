
package testvahicle222333.newpackage;

import java.util.Scanner;


public class PrimeNumber {
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int input=scanner.nextInt();
        int count=0;
        
        for(int i =1;i<input;i++){
         if(input%i==0){
         count++;
         }
        }
        if(count<=2){
            System.out.println("it is prime number");
        }else{
            System.out.println("it is not prime");
        }
    }
   
}
