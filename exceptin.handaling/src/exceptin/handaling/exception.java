/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptin.handaling;

/**
 *
 * @author HP-PC
 */
public class exception {
    
    public static void main(String[] args) {
        try {
            int resuit=10/0;
            System.out.println(resuit);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("integer can not be divided by zero");
                    
        }
    }
    
}
