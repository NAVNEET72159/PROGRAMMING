package LeetCodePracticeQuestions;

public class LinkedListCycle {
    public static void main(String[] args) {
        List_Node head = new List_Node(3);
        head.next = new List_Node(2);
        head.next.next = new List_Node(0);
        head.next.next.next = new List_Node(-4);
        head.next.next.next.next = head.next;
        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(List_Node head) {
        if(head == null || head.next == null) {
            return false;
        }
        List_Node slow = head;
        List_Node fast = head.next;
        while(slow != fast) {
            if(fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
