package Collections;

import java.util.*;

public class SetDemo {

    static void print(Set<Integer> set) {

        System.out.println("Elements printed using Without Iterator:- ");

        // WARNING:- We can't use set like below
//        for(int i=0;i<set.size();i++){
//            System.out.println(set.get(i));
//        }

        for (Integer i : set) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    static void printUsingIterator(Set<Integer> set) {

        Iterator<Integer> iterator = set.iterator();

        System.out.println("Elements printed using Iterator:- ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer a[] = {1, 2, 3, 4, 45};
//        Set<Integer> set = new HashSet(Arrays.asList(a));
//      Set<Integer> set = new HashSet(Arrays.asList(1,2,3,4,45));
//        print(set);
        Set<Integer> set2 = new HashSet<>();
//        set2.addAll(Arrays.asList(a));
//        print(set2);

        Collections.addAll(set2, a);

        print(set2);

        // Set contains given value or not
//        System.out.println(set2.contains(3));

        // remove element from set
//        set2.remove(3);
//        print(set2);

        // check set contains any value or not
//        System.out.println(set2.isEmpty());

        //********* we can't change any element of set because there is no index present in set *********
    }

}
