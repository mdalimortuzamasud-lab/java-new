
package primenumber2;

import java.util.Scanner;


public class PrimeNumber5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int Input =scanner.nextInt();
        int count=0;
        for(int i=1;i<=Input;i++){
        if(Input%i==0){
        count++;
        }
        }
        if(count<=2){
            System.out.println("prmie number");
        }else{
            System.out.println("not prime");
        }
    }
}
