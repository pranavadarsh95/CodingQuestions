package Basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AllAboutArray {

//    left hand side => referenced variable
//    right hand side => object creation using new keyword (memory assigned in heap)
    public static void main(String[] args) {
        // Declaration
        int a1[] = new int[5];
//        System.out.println(a1.length); // 5
        int a2[] = null; // not pointing to any memory address
//        System.out.println(a2.length); // will throw NPE
        int a3[] = {};
//        System.out.println(a3.length); // 0

        int a4[] = {21,2,43,4,25,236,6,27,88,38,959};

        int a5[] = Arrays.copyOf(a4, a4.length);

        System.out.println("Before "+Arrays.toString(a5));

        // below a3 will point to new memory address
        a3 = new int[]{1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 9};


        // Sort by default - increasing
        Arrays.sort(a5);
        System.out.println("After "+Arrays.toString(a5));

        Integer a6[] = Arrays.stream(a4).boxed().toArray(Integer[]::new);
//        // Sort decreasing
        Arrays.sort(a6, new MyCustomArray1());
        System.out.println("After decreasing "+Arrays.toString(a6));

        // using in built Comparator
        Arrays.sort(Arrays.stream(a5).boxed().toArray(Integer[]::new), Collections.reverseOrder());

        Arrays.sort(a6, Collections.reverseOrder());



//        Array to list
        List<Integer> list = Arrays.asList(a6);
        Integer temp[] = list.toArray(new Integer[list.size()]);
        int a[] = Arrays.stream(temp).mapToInt(Integer::intValue).toArray();

        int sortedArray[] = {1,3,3,3,4,4,6,7,8,10,12,};
        System.out.println(Arrays.binarySearch(sortedArray, 0,2,100 ));


        // 2D Array - Declaration
        int xyz[][] = new int[4][];
        int xyz1[][] = {{1,2,3,4,6},
                        {3,4,56,78,890}};

    }
}


class MyCustomArray1 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }

    void abc(){

    }
}
