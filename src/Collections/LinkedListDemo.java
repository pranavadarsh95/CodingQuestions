package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    static void print(LinkedList<Integer> linkedList) {

        System.out.println("Elements printed using Without Iterator:- ");

        for (int a : linkedList) {
            System.out.print(a + " ");
        }

        System.out.println();

//        for(int i=0;i<linkedList.size();i++){
//            System.out.print(linkedList.get(i)+" ");
//        }
//       System.out.println();
    }

    static void printUsingIterator(LinkedList<Integer> linkedList) {
        Iterator<Integer> iterator = linkedList.iterator();

        System.out.println("Elements printed using Iterator:- ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.addAll(Arrays.asList(1, 2, 3, 4, 5, 566));
        linkedList.addLast(50);
        linkedList.addFirst(20);
        print(linkedList);


// Accessing elements
//        System.out.println(linkedList.get(2));
//        System.out.println(linkedList.getFirst());
//        System.out.println(linkedList.getLast());


        // add at specific position
//       linkedList.add(4,89);
//        print(linkedList);

// SET
//       linkedList.set(3,900);
//        print(linkedList);


// Removing elements
//        System.out.println(linkedList.remove(2));
//        System.out.println(linkedList.removeFirst());
//        System.out.println(linkedList.removeLast());
//        print(linkedList);

        // peek() -> first element of Linkedlist
        // offer() -> add element to the end of linkedlist
        // poll() -> remove first element from the linkedlist

        // view last element
        System.out.println(linkedList.peek());

        // add elements
        System.out.println(linkedList.offer(678));
        System.out.println(linkedList.offerFirst(96));
        System.out.println(linkedList.offerLast(4323));
        print(linkedList);

        // remove element
        System.out.println(linkedList.poll());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollLast());
        print(linkedList);
    }
}
