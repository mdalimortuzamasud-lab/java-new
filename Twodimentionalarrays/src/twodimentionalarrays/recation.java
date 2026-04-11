/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodimentionalarrays;

/**
 *
 * @author HP-PC
 */
public class recation {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public  static int factorial(int i){
        if (i==0) {
            return 1;
        } else {
            return i*factorial(i-1);
        }
        }
}
