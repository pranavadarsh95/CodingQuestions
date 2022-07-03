package Basics;

public class StringDemo {

    public static void main(String[] args) {
        String name = "pratibha"; // string pool
        String name2 = new String(); // heap
        name2 = "pranav";

        System.out.println(name);
        System.out.println(name2);
        name = "RatHi";
        System.out.println(name);
        name2 = "RatHi";
        System.out.println(name2);

        for (int i=0; i<name.length() ; i++){
            System.out.println(name.charAt(i));
        }

        //Methods in String
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.compareTo(name2));
        System.out.println(name.equals("Rathi"));
        System.out.println(name.equalsIgnoreCase("rathI"));
        //passing string(or substring) to get starting index of sub-string
        System.out.println(name.indexOf("tHi"));
        // passing character to get matched index of original string
        System.out.println(name.indexOf("i"));
        String save = name.replace('a','z');
        System.out.println(save);
    }
}
