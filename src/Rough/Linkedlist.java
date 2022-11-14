package Rough;

public class Linkedlist {

    Node head;

   static class Node{
        int data;
        Node next;

         Node(int data){
            this.data = data;
            next = null;
        }
    }

    static Node insert(Linkedlist list, int data){
        Node temp = list.head ;

        Node newNode = new Node(data);

        if(temp == null){
            temp = newNode;
            return temp;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

        return list.head;
    }

    public static void main(String[] args) {

        Linkedlist ls = new Linkedlist();

        Node head = insert(ls,10);
    }
}
