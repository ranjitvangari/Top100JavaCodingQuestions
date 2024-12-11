package src.java;
// How do you reverse an array in place
// Swap the elements starting from both ends of the array and move towards the center
public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) { // key is to iterate till length / 2
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }
}
