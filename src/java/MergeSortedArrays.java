package src.java;
// How to merge two arrays and sort
import java.lang.reflect.Array;
import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arra1 = {6,2,3,4,5,11};
        int[] arra2 = {7,8,9,10,12,1};
         int[] mergeArray = merge(arra1,arra2);
        System.out.println("merged array::"+ Arrays.toString(mergeArray));
      /*  //Collection
        HashMap map1 = new HashMap();

        LinkedList<String> ArrayListOfStrings2 = new LinkedList<String>(); // declaration type 1
        LinkedList<String> ArrayListOfStrings = new LinkedList<String>(Arrays.asList("a","b","c")); // declaration type 2

        Iterator<String> stringIterator = ArrayListOfStrings.iterator();

        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next());*/
        }



    public static int[] merge(int[] array1, int[] array2) {
        int array1Length = array1.length;
        int array2Length = array2.length;

        int[] resultArray = new int[array1Length + array2Length];
        int i , j, k =0 ;
        for(i = 0; i < array1Length; i ++) {
            resultArray[i] = array1[i];
        }

        for(j = 0; j < array2Length; j ++) {
            resultArray[array1Length+j] = array2[j];
        }
        System.out.println("result array before sort:: "+ Arrays.toString(resultArray));
       Arrays.sort(resultArray);
       return resultArray;
    }
}
