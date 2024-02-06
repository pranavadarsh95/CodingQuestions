package Basics.Conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


// In simple language
/*
   Array to List -> Arrays.asList(array pass karo or values);
   List to Array -> list.toArray(new Integer[0]);
 */

/*
 int a[] ={10,20,30,40,50};

        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        a= list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(a));
 */

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
        System.out.println();

//        VVVVVVV.IMP  [ https://www.techiedelight.com/convert-list-integer-array-int/ ]
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        int[] a1 = list2.toArray(new int[list2.size()]); // wrong 

        int[] a1 = list.stream().mapToInt(Integer::intValue).toArray();

//        Filter out the null values before mapping:
        int a2[] = list.stream().filter(Objects::nonNull).mapToInt(Integer ::intValue).toArray();
        System.out.println(Arrays.toString(a2));

//        Map the null values to a default value:
        int a3[] = list.stream().map(i -> (i==null?0:i)).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(a3));
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
