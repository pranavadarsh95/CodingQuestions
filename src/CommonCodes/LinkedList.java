package CommonCodes;

/**
 * Insertion operation (at last, at first, at position)
 * Deletion operation (at last, at first, at position)
 * search
 */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {

    Node head;

    public boolean searchKey(LinkedList list, int key) {
        Node curr = list.head;

        while (curr != null) {
            if (curr.data == key) {
                System.out.println("Searched data has been found");
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public LinkedList deleteAtFirst(LinkedList list) {

        Node curr = list.head;
        if (curr != null) {
            System.out.println("Value " + curr.data + " deleted");
            curr = curr.next;
            list.head = curr;
        }
        return list;
    }

    public LinkedList deleteAtLast(LinkedList list) {
        Node curr = list.head;
        Node prev = curr;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Value " + curr.data + " deleted");
        prev.next = curr.next;

        return list;
    }

    public LinkedList deleteAtAnyPos(LinkedList list, int pos) {

        Node curr = list.head;
        Node prev = curr;

        int count = count(list);
        if (pos > count(list)) {
            System.out.println("Deletion is not possible, there are only " + count + " elements present");
            return list;
        }
        if (pos == 1) {
            System.out.println("Value " + curr.data + " deleted");
            curr = curr.next;
            list.head = curr;
            return list;
        }


        for (int i = 1; i < pos; i++) {
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Value " + curr.data + " deleted");
        prev.next = curr.next;

        return list;
    }

    public LinkedList insertAtLast(LinkedList list, int value) {
        Node node = new Node(value);

        Node curr = list.head;
        if (curr == null) {
            list.head = node;
            System.out.println("Added head of linkedlist");
            return list;
        }

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = node;

        return list;
    }

    public LinkedList insertAtFirst(LinkedList list, int value) {
        Node node = new Node(value);

        Node curr = list.head;
        if (curr == null) {
            list.head = node;
            System.out.println("Added head of linkedlist");

            return list;
        }
        node.next = curr;
        list.head = node;

        return list;
    }

    public LinkedList insertAtAnyPosition(LinkedList list, int value, int pos) {
        Node node = new Node(value);

        Node curr = list.head;
        Node prev = curr;

        if (curr == null || pos == 1) {
            node.next = list.head;
            list.head = node;

            System.out.println("Added head of linkedlist");

            return list;
        }

        for (int i = 1; i < pos; i++) {
            prev = curr;
            curr = curr.next;
        }

        node.next = curr;
        prev.next = node;

        return list;
    }

    public void printvalues(LinkedList list) {
        Node curr = list.head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
        System.out.println("Total count " + count(list));
    }

    private int count(LinkedList list) {
        int count = 0;

        Node curr = list.head;
        while (curr != null) {
            ++count;
            curr = curr.next;
        }
        return count;
    }

    LinkedList reverseLinkedList(LinkedList list){
        Node curr = list.head;

        Node prev = null, next = curr;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.head = prev;
        return list;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        /* Insertion */

        list = list.insertAtLast(list, 10);
        list = list.insertAtLast(list, 20);
        list = list.insertAtLast(list, 30);
        list = list.insertAtLast(list, 40);
        list = list.insertAtLast(list, 50);
        list = list.insertAtLast(list, 60);

        list = list.insertAtFirst(list, -10);

        list.printvalues(list);
/*
        list = list.insertAtAnyPosition(list, 35, 8);

        list.printvalues(list);

        *//* Search *//*

        int key = 90;
        System.out.println(list.searchKey(list, key) ? " found" : " not found");

        *//* DeleteAtLast *//*

        list = list.deleteAtFirst(list);
        list.printvalues(list);

        list = list.deleteAtLast(list);
        list.printvalues(list);

        int pos = 7;

        list = list.deleteAtAnyPos(list, pos);
        if (list != null) list.printvalues(list);*/
        list = list.reverseLinkedList(list);
        list.printvalues(list);
    }

}