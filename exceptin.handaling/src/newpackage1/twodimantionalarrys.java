/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author HP-PC
 */
public class twodimantionalarrys {
    public static void main(String[] args) {
        int [][]numbers={
            {30,20,50},
            {44,23,40},
            {11,22,5},
            {2,1,9},
            {9,0,8},
            {0,2,1},
            {5,3,4}
        };
        for (int []item:numbers ){
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
        for (int []item:numbers ){
            System.out.println(Arrays.toString(item));
        }
        
    }
}
