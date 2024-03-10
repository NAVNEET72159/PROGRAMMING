package LeetCodePracticeQuestions;

public class MidleOfTheLinkedList {
    public static void main(String[] args) {
        List_Node head = new List_Node(1);
        head.next = new List_Node(2);
        head.next.next = new List_Node(3);
        head.next.next.next = new List_Node(4);
        head.next.next.next.next = new List_Node(5);
        System.out.println(middleNode(head).val);
    }
    public static List_Node middleNode(List_Node head) {
        if (head.next == null)
            return head;

        List_Node slow = head;
        List_Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
