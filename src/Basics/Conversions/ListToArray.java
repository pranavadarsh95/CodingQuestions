package Basics.Conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToArray {
    public static void main(String[] args) {

        // ------------------------------- Array to List -------------------------------
        // Type -1

       /* Integer a[] = {1,2,3,4,5};
        printInteger(a);
        List<Integer> list = new ArrayList<>(Arrays.asList(a));
        printList(list);*/

        // Type -2

       /* int a[] = {1,2,3,4,5};
        printInt(a);
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        printList(list);*/

        // ------------------------------- List to Array -------------------------------
        // Type -1

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer a[] = list.toArray(new Integer[0]);
        printInteger(a);


    }

    static void printInt(int a[]){
        System.out.println("Printing Array:-");
        for(Integer i:a){
            System.out.print(i+" ");
        }
    }

    static void printInteger(Integer a[]){
        System.out.println("Printing Array:-");
        for(Integer i:a){
            System.out.print(i+" ");
        }
    }

   static void printList(List<Integer> list){
       System.out.println("\nPrinting List:-");
        for(Integer i:list){
            System.out.print(i+" ");
        }
    }
}
