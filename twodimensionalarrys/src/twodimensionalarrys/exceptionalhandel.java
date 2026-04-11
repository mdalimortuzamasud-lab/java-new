/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodimensionalarrys;

/**
 *
 * @author HP-PC
 */
public class exceptionalhandel {
    public static void main(String[] args) {
        try {
            int result=10/0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("integer can not be divided by zero");
        }
    }
}
