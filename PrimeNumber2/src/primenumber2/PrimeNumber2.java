
package primenumber2;

import java.util.Scanner;


public class PrimeNumber2 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int Masud =scanner.nextInt();
        int count=0;
        
        for(int i=1;i<=Masud;i++){
        if(Masud%i==0){
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
