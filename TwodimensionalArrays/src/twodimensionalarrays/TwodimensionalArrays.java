
package twodimensionalarrays;

import java.util.Arrays;


public class TwodimensionalArrays {

   
    public static void main(String[] args) {
      int [][]numbers={
          {34,12,67,89},
          {56,45,12,9},
          {3,4,2,1,0},
          {34,56,23,12}
      
      
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
