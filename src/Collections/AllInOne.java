package Collections;

import java.util.*;


/* Note:-
 Want to print 1D array with System.out.println() then
     => use System.out.println(Arrays.toString(PASS_THE_ARRAY))
 Want to print 2D array with System.out.println() then
     => use System.out.println(Arrays.deepToString(PASS_THE_2DARRAY))
 */


public class DequeDemo {
    // Implementing Queue using Dequeue

    public static void main(String[] args) {
        // offer(), poll(), peek() <= they doesn't throw execption
        // add(), remove(), element() <= they throw exceptions

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
        q.remove(20);
        System.out.println(q); // [120, 10, 30, 40]
        System.out.println(q.contains(120));
//        q.clear();
        System.out.println(q.containsAll(Arrays.asList(120,10,30,40))); // true
//       Integer a[] = q.toArray();
        System.out.println(q.size());
        System.out.println(Arrays.toString(q.stream().sorted().toArray())); // Increasing order
        System.out.println(Arrays.toString(q.stream().sorted(Collections.reverseOrder()).toArray())); // decreasing order
        System.out.println(q.stream().max(Integer::compareTo));
        System.out.println(q.stream().min(Comparator.reverseOrder()));
        System.out.println(q.isEmpty());

        // Implementing
   /*     Stack<Integer> stack = new Stack<>();
        // Adding
        stack.add(150);
//        stack.offer(110); // offer is not a method in stack
        stack.add(120);
        stack.add(20);
        System.out.println(stack.peek()); // peek() is not a method in stack
        stack.add(30);
//        System.out.println(stack.element()); // element is not a method in stack
        System.out.println(stack.peek()); // 150

        System.out.println(stack); // [150, 110, 120, 10, 20, 30, 40]

        // Remove
//        stack.poll(); // poll() is not a method in stack

        stack.remove();

        System.out.println(stack); // [120, 10, 20, 30, 40]*/
    }
}
