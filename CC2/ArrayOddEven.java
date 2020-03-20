
package arrayoddeven;

import java.util.Arrays;


public class ArrayOddEven {

    
    public static void main(String[] args) {
        int[] num = {3,9,15,20,65,23,18,4,2,14};
        
        Arrays.sort(num);
        int[] odd = new int[num.length];
        int[] even = new int[num.length];
        
        int oddCount = 0;
        int evenCount = 0;
        
        for (int i = 0; i < num.length; i++){
            
            if(num[i] % 2 == 0){
                even[evenCount]=num[i];
                evenCount++;
            }else {
                odd[oddCount]=num[i];
                oddCount++;
            }
        }
        System.out.println("Even \t Odd");
        for (int i=0; i < oddCount; i++)
            System.out.println(even[i]+"\t"+odd[i]);
    }
}
