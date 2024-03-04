package LeetCodePracticeQuestions;

class List_Node {
    int val;
    List_Node next;
    List_Node() {}
    List_Node(int val) { this.val = val; }
    List_Node(int val, List_Node next) {
        this.val = val;
        this.next = next;
    }
}
public class RemoveNthNodeFromEndList {
    public static void main(String[] args) {
        List_Node head = new List_Node(1);
        head.next = new List_Node(2);
        head.next.next = new List_Node(3);
        head.next.next.next = new List_Node(4);
        head.next.next.next.next = new List_Node(5);
    }
    public static List_Node removeNthFromEnd(List_Node head, int n) {
        List_Node dummy = new List_Node(0);
        dummy.next = head;
        List_Node first = dummy;
        List_Node second = dummy;
        for(int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        while(first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
