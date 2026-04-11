
package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter lenght: ");
        double length = input.nextDouble();
        
        System.out.println("Enter width: ");
        double width = input.nextDouble();
        
        double area = length * width;
        
        double perimeter = 2 + (length+width);
        
        System.out.println("area is : " + area);
        System.out.println("perimeter is" + perimeter);
    }
    
}
