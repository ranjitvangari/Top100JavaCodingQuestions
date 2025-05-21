package src.java;

import java.util.Arrays;

public class SortedSquaredArray {
    public static int[] sortedsquareArray(int[] array) {
        int[] newSrtArray = new int[array.length];
        int j = 0;
        for (int k : array) {
            {
                newSrtArray[j] = k * k;
                j++;
            }
        }
        Arrays.sort(newSrtArray);
        return newSrtArray;
    }

    public static void main(String[] args) {
        int[] array = {-10, -5, 0, 5, 10};
        System.out.println("array"+ Arrays.toString(sortedsquareArray(array)));
    }
}
