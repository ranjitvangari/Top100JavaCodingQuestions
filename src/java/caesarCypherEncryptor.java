package src.java;

public class caesarCypherEncryptor {

    public static String returnCaesarCypherEncryptor(String str, Integer key) {
    int normalizedKey = key % 26;
    StringBuilder encrypted = new StringBuilder();

    for(int i = 0; i < str.length(); i++){

        if(str.charAt(i) == ' '){
            encrypted.append(" ");
            continue;
        }
        char c = str.charAt(i);
        encrypted.append(shiftChar(c,normalizedKey));

    }

        return encrypted.toString();
    }

    public static char shiftChar(char c, int key) {
        int shifted = c + key;
        return(shifted <= 'z') ?
                (char) shifted :
                (char) ('a' + (shifted - 'z' -1));
    }

    public static void main(String[] args) {
        String input = "zxy dsfsd";
        System.out.println(returnCaesarCypherEncryptor(input,2));
    }
}
