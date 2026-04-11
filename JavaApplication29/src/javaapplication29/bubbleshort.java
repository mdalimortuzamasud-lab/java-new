/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication29;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HnyP-PC
 */
public class bubbleshort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("give arrays tength");
        int n =scanner.nextInt();
        int numbers[]=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("enter your number");
            numbers[i]=scanner.nextInt();
            
        }
        System.out.println("arrays"+Arrays.toString(numbers));
        
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (numbers[j]>=numbers[j+1]) {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println("sorter arrays"+Arrays.toString(numbers)); 
        
    }
}
