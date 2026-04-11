
package primenumber2.in2;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("factorial number");
        int input =scanner.nextInt();
        
        
        
        
        int factoirial=1;
        for(int i=1;i<=input;i++){
        factoirial*=i;
        }
            System.out.println("factoril is"+factoirial);
    }
}
