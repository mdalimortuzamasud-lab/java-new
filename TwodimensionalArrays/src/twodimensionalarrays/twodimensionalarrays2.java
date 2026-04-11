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
public class twodimensionalarrays2 {
    public static void main(String[] args) {
        int [][]numbers={
            {24,12,1},
            {56,34,12},
            {78,45,12,}
            
            
        };
        for (int[] item : numbers) {
            for (int i = 0; i < item.length-1; i++) {
                for (int j = 0; j < item.length-1-i; j++) {
                    if (item[j]>item[j+1]) {
                        int temp=item[j];
                        item[j]=item[j+1];
                        item[j+1]=temp;
                    }
                }
            }
            System.out.println(Arrays.toString(item));
        }
    }
}
