package src.java;

public class RunLengthEncoding {
    public static String runLengthEncoding(String input) {
        if(input == " " || input.isEmpty()){
            return " " ;
        }

        StringBuilder sb = new StringBuilder();
        char current = input.charAt(0);
        int count = 1;

        for(int i =1; i <input.length(); i++) {
            if(input.charAt(i) == current && count < 9){
                count++;
            } else {
                append(sb, count, current);
                count = 1;
                current = input.charAt(i);
            }
        }
        append(sb, count, current);
        return sb.toString();
    }
    public static void append(StringBuilder sb, int occurence, char letter){
        sb.append(occurence).append(letter);
    }

    public static void main(String[] args) {
        String input = "aaaaaaaaabbbbbbaannnnxxx";
        System.out.println("runLengthEncoding::"+ runLengthEncoding(input));

    }
}
