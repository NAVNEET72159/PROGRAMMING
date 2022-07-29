package com.company;

class node
{
    int data;
    node next;
}

public class Linked_List_Deletion {
    node head;

    public void addElements(int val) {
        node newNode = new node();
        newNode.data = val;
        newNode.next = head;

        head = newNode;
    }
    public void printList() {
        node temp = head;
        int i = 1;
        while (temp.next != null) {
            System.out.println(i + "Element of the linked list is: " + temp.data);
            temp = temp.next;
        }
    }
    public static void main(){
        Linked_List_Deletion linked_list_deletion = new Linked_List_Deletion();
        linked_list_deletion.addElements(10);
        linked_list_deletion.addElements(20);
        linked_list_deletion.addElements(30);
        linked_list_deletion.addElements(40);
        linked_list_deletion.printList();
    }
}
