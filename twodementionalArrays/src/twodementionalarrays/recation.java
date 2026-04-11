/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodementionalarrays;

/**
 *
 * @author HP-PC
 */
public class recation {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
    public  static int fac(int n){
        if (n==0) {
            return 1;
        } else {
            return n*fac(n-1);
        }
    }
}
