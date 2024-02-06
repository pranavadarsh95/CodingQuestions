package Rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// List to Array -> list.toArray();
// Array to list -> Arrays.asList();



public class TwentySixthOct {
    public static void main(String[] args) {
      //List
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,34,4,4,15,5));
        // insert many elements at once during initialization
//        list.addAll();
        System.out.println(list);

        int a[] = list.stream().mapToInt(Integer::intValue).toArray();
        // assign above list in above array

        int b[] = {1,2,3,4,45,8};

        // Assign above array in below list
        List<Integer> list2 = Arrays.stream(b).boxed().collect(Collectors.toList());


        Integer a1[] ={1,2,3,4,5};
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,a1);
        System.out.println(arrayList);

    }
}
