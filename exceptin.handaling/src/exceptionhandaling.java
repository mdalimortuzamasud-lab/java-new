/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP-PC
 */
public class exceptionhandaling {
    public static void main(String[] args) {
        try {
            int result =10/0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
