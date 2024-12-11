package src.java;

import java.util.Arrays;

//How do you find the duplicate number in an array of integers where all numbers are between 1 and n
// and length of
//Using Floyd's Tortoise and Hare Algorithm
public class FindDuplicateInArray {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        fast = nums[0];
        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] array = { 4,3,1,2,4,};
        char[] arrayDemo = new char[5];
        System.out.println("Duplicate element found: " + findDuplicate(array));
        System.out.println("arrayDemo length is:: "+ arrayDemo.length);
        System.out.println(arrayDemo[0]);
    }
}
