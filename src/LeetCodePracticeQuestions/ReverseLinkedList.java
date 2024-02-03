package LeetCodePracticeQuestions;

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) { this.val = x; }
    ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode2 head = new ListNode2(1);
        ListNode2 temp = head;
        temp.next = new ListNode2(2);
        temp = temp.next;
        temp.next = new ListNode2(3);
        temp = temp.next;
        temp.next = new ListNode2(4);
        temp = temp.next;
        temp.next = new ListNode2(5);
        temp = temp.next;
        ListNode2 result = reverseList(head);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode2 reverseList(ListNode2 head) {
        ListNode2 prev = null;
        ListNode2 curr = head;
        while(curr != null) {
            ListNode2 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
