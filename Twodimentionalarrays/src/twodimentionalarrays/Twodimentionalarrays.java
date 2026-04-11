
package twodimentionalarrays;

import java.util.Arrays;



public class Twodimentionalarrays {

  
    public static void main(String[] args) {
        int [][] numbers={
            {34,34,23,67,},
            {12,45,67,12,3},
            {34,5,67,23,12},
            {34,67,34,89},
            {45,78,12,23}
        
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
          for (int[] item : numbers) {
              System.out.println(Arrays.toString(item));
          }
           }
    
}
