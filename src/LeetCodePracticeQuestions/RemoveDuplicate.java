package LeetCodePracticeQuestions;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { this.val = x; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveDuplicate {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        temp.next = new ListNode(1);
        temp = temp.next;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        System.out.println(removeDuplicates(head));
    }
    public static ListNode removeDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null) {
            if(temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }
}
