package com.company;

class Doubly_Node{
    int data;
    Doubly_Node prev;
    Doubly_Node next;
}
public class Doubly_Linked_List {
    public static void main(String [] args){

        Doubly_Node head, middle, last;

        head = new Doubly_Node();
        middle = new Doubly_Node();
        last = new Doubly_Node();

        head.data = 110;
        middle.data = 220;
        last.data = 330;

        head.next = middle;
        middle.next = last;
        last.prev = middle;
        middle.prev =  head;
        head.prev = null;
        last.next = null;

        System.out.println("Element is Doubly Linked List are: ");
        Doubly_Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
