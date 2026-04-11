
package twodementionalarrays;

import java.awt.event.ItemEvent;
import java.util.Arrays;


public class TwodementionalArrays {

    public static void main(String[] args) {
        
        int[][]numbers={
            {20,10,30},
            {15,19,7},
            {78,9,21},
            {6,9,10},
            {89,0,34}
        
        };
        for (int[] item  : numbers) {
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
         for (int[] item  : numbers) {
             System.out.println(Arrays.toString(item));
         }
    }
    
}
