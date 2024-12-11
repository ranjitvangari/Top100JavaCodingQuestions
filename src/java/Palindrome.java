package src.java;

public class Palindrome {
//    solution1:
    public static void main(String[] args) {
            String str = "madam";
            String reversedStr = new StringBuilder(str).reverse().toString();

            if (str.equals(reversedStr)) {
                System.out.println("The string is equal to its reverse so this string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome as it is not equal to its reverse.");
            }
        }
    }

  //  solution2:
    /*public class CompareStringWithReverse2 {
        public static void main(String[] args) {
            String str = "madam";
            boolean isEqual = true;

            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    isEqual = false;
                    break;
                }
                left++;
                right--;
            }

            if (isEqual) {
                System.out.println("The string is equal to its reverse.");
            } else {
                System.out.println("The string is not equal to its reverse.");
            }
        }
    }*/


