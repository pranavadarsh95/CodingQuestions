package Collections.LinkedList;

public class CustomLinkedListImpl {
    public static void main(String[] args) {

        /* 1. LinkedList operations
              addAtPos, addFirst, addLast
              removeAtPos, removeFirst, removeLast
              count(), search()
        */

        CustomLinkedlist customLinkedlist = new CustomLinkedlist();
        System.out.println(customLinkedlist.addFirst(100));
        customLinkedlist.addFirst(200);
        customLinkedlist.addFirst(300);
        customLinkedlist.addLast(1200);
        customLinkedlist.addFirst(400);
        customLinkedlist.addFirst(500);

        // 100 200 300 400 500 NULL => 100 200 543 300 400 500 NULL

        print(customLinkedlist.head);
        customLinkedlist.addAtPos(6, 543);
        System.out.println();
        print(customLinkedlist.head);

        System.out.println();

        System.out.println("Total count: " + count(customLinkedlist.head));

        int key = 1201;

        System.out.println("Search element "+ key +" found at index: " + searchL(customLinkedlist.head, key));
    }

    private static int searchL(CustomLinkedlist.Node head, int key) {
        int count = 0;
        while(head != null){
            if(head.getValue() == key){
                return count;
            }
            ++count;
            head = head.next;
        }
        return -1;
    }

    private static int count(CustomLinkedlist.Node head) {
        int count = 0;
        while(head != null){
            ++count;
            head = head.next;
        }
        return count;
    }

    static void print(CustomLinkedlist.Node head) {
        while (head != null) {
            System.out.print(head.getValue() + " ");
            head = head.next;
        }
    }
}

class CustomLinkedlist {
    CustomLinkedlist.Node head;

    CustomLinkedlist() {
        head = null;
    }

    public boolean addFirst(int value) {
        CustomLinkedlist.Node node = new CustomLinkedlist.Node(value);
        node.next = head;
        head = node;
        return true;
    }

    public boolean addLast(int value) {
        CustomLinkedlist.Node temp = head;
        CustomLinkedlist.Node node = new CustomLinkedlist.Node(value);
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        return true;
    }

    public boolean addAtPos(int pos, int value) {
        CustomLinkedlist.Node node = new CustomLinkedlist.Node(value);
        CustomLinkedlist.Node temp = head;
        // 1st pos
        if (pos == 0) {
            node.next = head;
            head = node;
        } else {
            // middle pos
            for (int i = 1; i <= pos - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        return true;
    }


    class Node {
        int value;
        CustomLinkedlist.Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        public int getValue() {
            return value;
        }
    }
}

