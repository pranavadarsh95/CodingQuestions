package Rough;

import java.util.*;

public class RoughWork {
    public static void main(String[] args) {

        Integer a[] ={1,2,3,4,5};
//        List<Integer> b = new ArrayList<Integer>(Arrays.asList(a));
//        System.out.println(b);

        ArrayList<Integer> arrayList = new ArrayList<>();

         Collections.addAll(arrayList,a);
        System.out.println(arrayList);

//    Project running on my system using jdk-11
    }
}
