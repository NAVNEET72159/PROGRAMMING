package LeetCodePracticeQuestions;

class Node {
    int val;
    Node left;
    Node right;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class SameTree {
    public static void main(String[] args) {
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);
        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);
        System.out.println(isSameTree(p, q));
    }
    public static boolean isSameTree(Node p, Node q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
