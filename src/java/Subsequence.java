package src.java;

import java.util.*;

class Subsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;
        while (arrayIndex < array.size() && sequenceIndex < sequence.size()) {
            if (array.get(arrayIndex).equals(sequence.get(sequenceIndex))) {
                sequenceIndex++;
            } else {
                arrayIndex++;
            }
            if(sequence.size() == sequenceIndex) {
                return true ;
            }
        }
        return false;
    }

    public static void main(String[] args) {
       List<Integer> inputarray = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
       List<Integer> subset = Arrays.asList(1, 6, -1, 10);
        System.out.println("result is"+isValidSubsequence(inputarray,subset));

    }
}