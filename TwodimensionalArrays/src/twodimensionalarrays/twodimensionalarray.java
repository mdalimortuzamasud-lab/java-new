/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodimensionalarrays;

import java.util.Arrays;

/**
 *
 * @author HP-PC
 */
public class twodimensionalarray {
    public static void main(String[] args) {
        int[][]masud={
            {34,23,12,0},
            {45,12,13,0},
            {78,34,12,56},
            {90,12,45,67},
            {56,12,45,90}
        
        };
        for (int[] item : masud) {
            for (int i = 0; i < item.length-1; i++) {
                for (int j = 0; j < item.length-1-i; j++) {
                    if (item[j]>item[j+1]) {
                        int temp=item[j];
                        item[j]=item[j+1];
                        item[j+1]=temp;
                    }
                }
            }
        }
        for (int[] item : masud) {
            System.out.println(Arrays.toString(item));
        }
    }
}
