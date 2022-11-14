package Basics;

import java.util.ArrayList;
import java.util.List;

public class StringOperations {
    public static void main(String[] args) {

        String s ="19 278 R 789 278 L";

        doSeprateDigitAndCharacter(s);
    }

    private static void doSeprateDigitAndCharacter(String s) {

        String str[] = s.split(" ");

        List<String> storeString = new ArrayList<>();
        List<Integer> storeNumber = new ArrayList<>();

        System.out.println(str.length);
        for(int i = 0; i < str.length ; i++) {

            // to know given string has only character or not
            if(str[i].matches("[a-zA-Z]+")){
                storeString.add(str[i]);
            }

            // to know given string has only digit or not
            if(str[i].matches("[0-9]+")){
                storeNumber.add(Integer.parseInt(str[i]));
            }
        }

        for(String st : storeString)
            System.out.print(st+" ");

        for(Integer num : storeNumber)
            System.out.print(num+" ");
    }
}
