package Collections;

// processed in FIFO(First In First Out) order

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//Being an interface the queue needs a concrete class for the declaration and the most common classes are the
// PriorityQueue and LinkedList in Java. Note that neither of these implementations are thread safe.
// PriorityBlockingQueue is one alternative implementation if thread safe implementation is needed.
public class QueueDemo {

    static void printWithoutIterator(Queue<Integer> queue) {
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printWithIterator(Queue<Integer> queue) {

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    // Note:- There is no any specific method to remove from last
    static void removeAtLast(Queue<Integer> queue) {
        System.out.println("command reached point 1");
        System.out.println();
        int size = queue.size();
        Iterator<Integer> iterator = queue.iterator();

        while (iterator.hasNext()) {
            iterator.next();
        }
        System.out.println("command reached point 2");

        iterator.remove();
    }

    /*
    Note:-
    Question:- Why priority queue re-order element when I do poll()?
    Answer:- https://stackoverflow.com/questions/64288709/why-priority-queue-re-order-element-when-i-do-poll
    or,

    PriorityQueues store their elements in a heap (a min heap by default, but this can be changed with Collections.reverseOrder()
    passed to the constructor). This data structure only guarantees that the first element, or the element received from poll()
    will be the smallest element in the queue based on the natural ordering of the elements. When an object is removed, the queue
    is "heapified" to maintain the guarantee that the minimum element will be the next one polled. When you print the queue by
    calling the toString method, the heap is getting printed in a level order traversal, which is not necessarily representative
    of how the elements are being stored.
     */

    public static void main(String[] args) {
        Queue<Integer> queue;
        queue = new LinkedList<>();
//        queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);


        //    printWithoutIterator(queue);
        printWithIterator(queue);

        // to print top element of the Queue
        System.out.println("Top Element:- " + queue.peek());

        // remove first element from queue
        System.out.println("Remove first Element:- " + queue.poll());
        printWithIterator(queue);

        //Add element at the last
        System.out.println("Add Element At the Last:- " + queue.offer(70));
        printWithIterator(queue);

        // Remove element at the last
        removeAtLast(queue); // concreate method
        printWithIterator(queue);

       //Note:- "Below one doesn't work"
        /*
        You can remove elements from the Queue until you reach the needed one. You can re-add the removed elements at
        the end of the queue or put them in a different queue (and add the rest after you reached the needed element).
         */
        // System.out.println(queue.get(2));

    }


}
