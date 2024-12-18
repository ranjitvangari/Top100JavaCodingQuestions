package src.java;
//How do you find the longest common prefix in an array of strings
public class commonPrefix {
    public static void main(String[] args) {
        String str1 = "Reyan";
        String str2 = "Ranjit";
        int minLength = Math.min(str1.length(), str2.length());
        int i;
        for (i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println("i::" + i);
                return;
            }
        }
        System.out.println("no mismatch found");
    }
}
