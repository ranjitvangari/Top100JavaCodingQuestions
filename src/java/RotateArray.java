package src.java;

//How do you rotate an array by k positions

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {6,5,4,3,2,1,2,3,4,7,8};
       reverse(nums, 0, nums.length-1); // rotate entire array
        System.out.println("array reverse:: "+ Arrays.toString(nums));


    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[start] = arr[end];
            temp =arr[start];
            start ++;
            end --;
        }

    }
}
