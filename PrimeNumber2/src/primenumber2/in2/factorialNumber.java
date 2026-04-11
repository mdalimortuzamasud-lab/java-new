
package primenumber2.in2;

import java.util.Scanner;


public class factorialNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("factoril number");
        int input=scanner.nextInt();
        int factoril=1;
        
        for(int i=1;i<=input;i++){
    factoril*=i;
    
    }
        System.out.println(" factorial "+factoril);
    }
}
