package Collections;

import java.util.Stack;

// https://www.geeksforgeeks.org/stack-class-in-java/
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        System.out.println(stack);
    }
}
