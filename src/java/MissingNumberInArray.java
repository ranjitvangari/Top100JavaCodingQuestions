package src.java;
//How do you find the missing number in an array of integers from 1 to n
public class MissingNumberInArray {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;  // As one number is missing, the length should be n
        int expectedSum = (n * (n + 1)) / 2;  // Sum of first n numbers
        int actualSum = 0;

        // Calculate the sum of the elements in the array
        for (int num : nums) {
            actualSum += num;
        }

        System.out.println("n value:: "+n);
        System.out.println("expectedSum:: "+expectedSum);
        System.out.println("actualSum:: "+ actualSum);

        // The missing number is the difference between the expected and actual sums
        return expectedSum - actualSum;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6};  // Example array with missing number 3
        int missing = findMissingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }
}
