package src.java;

//Write a program to find the duplicate characters in list of string . Only java stream will be accepted ?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
        public static void main(String[] args) {
            String input="Ranjit kumar";
            List<String> duplicateCharacter = findDuplicateChracter(input);
            System.out.println("Duplicate character::::"+duplicateCharacter);
        }
        private static List<String> findDuplicateChracter(String input){
            return Arrays.stream(input.split(""))
                    .collect(Collectors.groupingBy(ch->ch , Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(cha->cha.getValue()>1)
                    .map(in->in.getKey())
                    .collect(Collectors.toList());

        }
    }

