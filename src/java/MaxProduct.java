package src.java;

import java.util.Arrays;

//How do you find the maximum product of two integers in an array
public class MaxProduct {
    public static int maxProduct(int[] nums) {

        //sort the array
        Arrays.sort(nums);

        int maxProduct = nums[nums.length - 1] * nums[nums.length - 2]; // maximum of product
        int minProduct = nums[0] * nums[1]; // minimum of product

        System.out.println("minproduct:: " + minProduct + "maxProduct:: " + maxProduct);

        return Math.max(maxProduct, minProduct);

    }

    public static void main(String[] args) {
        int[] input = {8,-9,-15,7,1,3};

        System.out.println("max of product is "+ maxProduct(input));
    }
}
