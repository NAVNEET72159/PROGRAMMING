package com.company;

class Node1
{
    int data;
    Node1 next;
}

public class Linked_List_Insertion {

    Node1 head;

    public void addFirst(int val){
        Node1 newNode = new Node1();
        newNode.data = val;
        newNode.next = head;

        head = newNode;
    }

    public void printList(){
        Node1 temp = head;

        System.out.print("Data List :- ");
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String [] args){

        Linked_List_Insertion list = new Linked_List_Insertion();
        System.out.println("Inserting 10");
        list.addFirst(10);
        System.out.println("Inserting 20");
        list.addFirst(20);
        System.out.println("Inserting 30");
        list.addFirst(30);
        System.out.println("Inserting 40");
        list.addFirst(40);

        list.printList();
    }
}
