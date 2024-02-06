package Collections;

import java.util.*;


/* Note:-
 Want to print 1D array with System.out.println() then
     => use System.out.println(Arrays.toString(PASS_THE_ARRAY))
 Want to print 2D array with System.out.println() then
     => use System.out.println(Arrays.deepToString(PASS_THE_2DARRAY))
 */


public class AllInOne {
    // Implementing Queue using Dequeue

    public static void main(String[] args) {
        // offer(), poll(), peek() <= they doesn't throw execption
        // add(), remove(), element() <= they throw exceptions
        /*
           peek() or element() and poll() or remove() are always work to the deleting side of Stack, queue, Deque
           add() or offer() always work at the side of elements are inserted
           offerFirst() and pollFirst() it will work opposite of normal queue or same as STACK
           [offerLast() or offer()] and [pollFirst() or poll()] will work as QUEUE
         */

//        callQueueUsingLinkedList();
        callStackUsingStack();
    }

    private static void callStackUsingStack() {
        System.out.println("Welcome in callStackUsingStack");
        // Implementing
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.capacity());
        // Adding
        stack.add(150);
//        stack.offer(110); // offer is not a method in stack
        stack.add(120);
        stack.add(20);
        System.out.println(stack.peek()); // 20
        stack.add(30);
//        System.out.println(stack.element()); // element is not a method in stack
        System.out.println(stack.peek()); // 30

        System.out.println(stack); // [150, 120, 20, 30]

        // Remove
//        stack.poll(); // poll() is not a method in stack

//        stack.remove(); // without Object or index it is not possible
        stack.remove(new Integer(30)); // (either object or index so, need to declare it object explicitly)

        System.out.println(stack); // [150, 120, 20]
        stack.remove(2); // removing with index
        System.out.println(stack); // [150, 120]
        stack.pop();
        System.out.println(stack); // [150]
        stack.addElement(7);
        stack.addElement(8);
        stack.addElement(34);
        stack.addElement(23);
        stack.addElement(123);
        System.out.println(stack.search(123)); // Not found returns -1, if founds then will return index of element from top and count starts from 1
        System.out.println(stack.contains(31)); // if found then true otherwise false returns
        System.out.println(stack.containsAll(Arrays.asList(7,8))); // if elemts are present in stack then true otherwise false
        System.out.println(stack.capacity()); // 10
        stack.addElement(45);
        stack.addElement(435);
        System.out.println(stack.size()); // 8
        stack.addElement(50);
        stack.addElement(39);
        System.out.println(stack.size()); // 10
        stack.addElement(435);
        System.out.println(stack.capacity()); // 20
        System.out.println(stack.elementAt(4)); // 23
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack); // [150, 7, 8, 34, 23, 123, 45, 435, 50, 39, 435]
        // Note:- index, object
        stack.set(2,56); // will replace 8 to 56
        System.out.println(stack); // [150, 7, 56, 34, 23, 123, 45, 435, 50, 39, 435]
        // Note:- object, index
        stack.setElementAt(78,6); // will replace 45 to 78
        System.out.println(stack); // [150, 7, 56, 34, 23, 123, 78, 435, 50, 39, 435]

         Integer a[] = stack.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(a)); // [150, 7, 56, 34, 23, 123, 78, 435, 50, 39, 435]

         int b[] = stack.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(b)); // [150, 7, 56, 34, 23, 123, 78, 435, 50, 39, 435]
        System.out.println(Arrays.toString(stack.stream().sorted().toArray())); // [7, 23, 34, 39, 50, 56, 78, 123, 150, 435, 435]
        System.out.println(Arrays.toString(stack.stream().sorted(Collections.reverseOrder()).toArray())); // [435, 435, 150, 123, 78, 56, 50, 39, 34, 23, 7]
        System.out.println(stack.stream().max(Integer::compareTo).get()); // 435
        System.out.println(stack.stream().min(Integer::compareTo).get()); // 7
        System.out.println("End of callStackUsingStack");
    }

    private static void callQueueUsingLinkedList() {
        System.out.println("Welcome in callQueueUsingLinkedList");
        // Implementing Queue using LinkedList [Everything would be happened from front side only]
        Queue<Integer> q = new LinkedList<>();
        // Adding
        q.add(150);
        q.offer(110);
        q.add(120);
        q.offer(10);
        q.add(20);
        System.out.println(q.peek()); // 150
        q.add(30);
        q.offer(40);
        System.out.println(q.element()); // 150
        System.out.println(q.peek()); // 150
        System.out.println(q); // [150, 110, 120, 10, 20, 30, 40]

        // Remove
        q.poll();
        System.out.println(q); // [110, 120, 10, 20, 30, 40]
        q.remove();
        System.out.println(q); // [120, 10, 20, 30, 40]
        q.remove(20); // It is taking Object (whereas in stack either object or index so, need to declare it object explicitly)
        System.out.println(q); // [120, 10, 30, 40]
        System.out.println(q.contains(120)); // true
//        q.clear();
        System.out.println(q.containsAll(Arrays.asList(120, 10, 30, 40))); // true

        // Wrapper class (converting Object Stream into Integer Array)
        Integer a[] = q.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(a)); // [120, 10, 30, 40]
        // Primitive value (converting Object Stream into int Array)
        int b[] = q.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(a)); // [120, 10, 30, 40]

        System.out.println(q.size()); // 4
        // to understand below one break it into multiple statement like
        /*
           q.stream().sorted() => returns Stream of DataType we passed
           q.stream().sorted().toArray() => converted above one into Integer Array of DataType we passed
           want to print at one go, using Arrays.toString()
           want to convert collection datatype into reverse order => Collections.reverseOrder()
         */
        System.out.println(Arrays.toString(q.stream().sorted().toArray())); // Increasing order [10, 30, 40, 120]
        System.out.println(q.stream().max(Integer::compareTo).get()); // 120
        System.out.println(Arrays.toString(q.stream().sorted(Collections.reverseOrder()).toArray())); // decreasing order [120, 40, 30, 10]
        System.out.println(q.stream().min(Integer::compareTo).get()); // 10
        System.out.println(q.isEmpty()); // false

        System.out.println("End of callQueueUsingLinkedList");
    }
}
