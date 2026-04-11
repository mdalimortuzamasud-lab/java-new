
package javaapplication9;

import java.util.Scanner;


public class JavaApplication9 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        System.out.println(" enter your lenght");
        double length = scanner.nextDouble();
        System.out.println("enter your width");
        double width = scanner.nextDouble();
        
        double area = (length*width);
        double perimeter = 2 +(length+width);
        
        System.out.println("area is" + area);
        System.out.println("perimeter is" + perimeter);
        
        
    }
    
}
