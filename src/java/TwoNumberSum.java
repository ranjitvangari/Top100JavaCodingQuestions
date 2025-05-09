//find two numbers in a Array whose sum can give targetsum
package src.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
       public static int[] twoNumberSum(int[] array, int targetSum) {
            Map<Integer, Boolean> stroingmap = new HashMap<>();
            for(int i = 0; i < array.length; i++){
                int currentNum = array[i];
                int potentialMatch = targetSum - currentNum;
                if(stroingmap.containsKey(potentialMatch)){
                    System.out.println ("potentialMatch:"+ potentialMatch + "currentNum"+ currentNum );
                    return new int[]{currentNum,potentialMatch};
                } else {
                    stroingmap.put(currentNum,true);
                }
            }
            return new int[0];
        }

public static void main(String[] args) {
    int[] array = { 4,3,1,2,4,};
    int sumtarget = 6;
    System.out.println("pair found"+ Arrays.toString(twoNumberSum(array,sumtarget )));
}

}
