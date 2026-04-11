/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodimensionalarrays;

/**
 *
 * @author HP-PC
 */
public class twodimensionalarrays1 {
    
    public static void main(String[] args) {
        
    
    int [][]numbers={
        {56,23,12,11,},
        {57,23,11,34,78},
        {90,23,45,12,},
        {6,4,3,2,1,0},
        {9,7,6,5,5,4,}
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
        }
  }
}
