package LeetCodePracticeQuestions;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        Tree_Node root = new Tree_Node(3);
        root.left = new Tree_Node(9);
        root.right = new Tree_Node(20);
        root.right.left = new Tree_Node(15);
        root.right.right = new Tree_Node(7);
        System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(Tree_Node root) {
        if(root == null)
            return true;
        return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public static int height(Tree_Node root) {
        if(root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }
}
