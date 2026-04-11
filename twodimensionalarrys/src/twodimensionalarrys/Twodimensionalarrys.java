/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twodimensionalarrys;

import java.util.Arrays;

/**
 *
 * @author HP-PC
 */
public class Twodimensionalarrys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][]numbers={
        
            {20,10,15},
            {5,6,1},
            {45,11,12}
        };
        for (int[] item : numbers) {
            for (int i = 0; i < item.length-1; i++) {
                for (int j = 0; j < item.length-1-i; j++) {
                    if (item[j]>item[j+1]) {
                        int temp=item[j];
                        item[j] =item[j+1];
                        item[j+1]=temp;
                    }
                }
            }
        }
        for (int[] item : numbers) {
            System.out.println(Arrays.toString(item));
        }
           }
    
}
