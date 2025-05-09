//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
package src.java;
import java.util.HashSet;

public class ContainsDuplicate {
        public static boolean containsDuplicate(int[] nums) {
            HashSet set = new HashSet<>();
            for(int i = 0; i < nums.length; i++){
                int potentialDuplicate = nums[i];
                if(set.contains(potentialDuplicate)){
                    return true;
                } else {
                    set.add(potentialDuplicate);
                }
                System.out.println(potentialDuplicate);
            }
            return false;
        }

        public static void main(String[] args) {
            int[] array = {1,2,2,1,3};
            System.out.println("is duplicate found"+ containsDuplicate(array));

}
}
