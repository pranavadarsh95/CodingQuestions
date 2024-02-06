package Basics;

/*
======================================================================================
 String is immutable(non-changable) whereas StringBuffer and StringBuilder are mutable(changable) classes.
 StringBuffer is thread-safe and synchronized whereas StringBuilder is not.
 That's why StringBuilder is faster than StringBuffer.

 ======================================================================================
 */

import java.util.Arrays;

public class StringDemo {

    public static void main(String[] args) {
        String name = "pratibha"; // string pool
        String name2 = new String("pranav"); // heap

        System.out.println(name);
        System.out.println(name2);

        name = "RatHi";
        System.out.println(name);
        name2 = "RatHi";
        System.out.println(name2);

        // String is immutable (Not changable)

          https://javaconceptoftheday.com/example-to-prove-strings-are-immutable/


        for (int i=0; i<name.length() ; i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();

        //Methods in String
        name = name.toLowerCase(); // now name string will also store lowercase
        System.out.println(name);
        System.out.println(name.toLowerCase());


        System.out.println(name.toUpperCase());
        System.out.println("name =>"+" "+name+" name2 =>"+" "+name2);
        System.out.println(name.compareTo(name2));
        System.out.println(name.equals("Rathi"));
        System.out.println(name.equalsIgnoreCase("rathI"));
        //passing string(or substring) to get starting index of sub-string
        System.out.println(name.indexOf("tHi"));
        // passing character to get matched index of original string
        System.out.println(name.indexOf("i"));
        String save = name.replace('a','z');
        System.out.println(save);

        // must read below methods https://www.geeksforgeeks.org/string-class-in-java/ [Very Important to read 5 min only]

        // Sorting a string will give you string in alphabetically not with length
        String s[] = {"flower","flow","flight"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        // Inserting character at specific position in String
        StringBuilder sb = new StringBuilder();
        sb.append("Pranav");
        sb.insert(2,'z');
        System.out.println(sb);
    }
}
