package com.company;

class DESLL
{
    int data;
    DESLL next;
}
public class Deletion_in_SLL {
    DESLL head;

    public void addElements(int val){
        DESLL newNode = new DESLL();
        newNode.data = val;
        newNode.next = head;
        head = newNode;
    }

    public void print()
    {
        DESLL temp = head;
        int i = 1;
        System.out.println("Elements in List: ");
        while (temp != null)
        {
            System.out.print(i+"."+")"+" "+temp.data+" ");
            temp = temp.next;
            i++;
        }
    }

    public void delete(int key)
    {

        if (head.data == key)
        {
            head = (head).next;
        }
        else
        {
            DESLL temp = head;
            while (temp.next != null)
            {
                if (temp.next.data == key)
                {
                    temp.next = temp.next.next;
                    break;
                }
                else
                {
                    temp = temp.next;
                }
            }
        }
    }
    public static void main(String [] args)
    {
        Deletion_in_SLL obj = new Deletion_in_SLL();
        obj.addElements(100);
        obj.addElements(200);
        obj.addElements(300);
        obj.addElements(400);
        obj.addElements(500);
        obj.addElements(600);

        System.out.println("Elements in Linked List before deletion");
        obj.print();

        obj.delete(600);
        obj.delete(200);
        obj.delete(500);

        System.out.println("Elements in Linked List after deletion: ");
        obj.print();
    }
}