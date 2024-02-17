package LeetCodePracticeQuestions;

public class MaximumDepth {
    public static void main(String[] args) {
        Tree_Node root = new Tree_Node(3);
        root.left = new Tree_Node(9);
        root.right = new Tree_Node(20);
        root.right.left = new Tree_Node(15);
        root.right.right = new Tree_Node(7);
        System.out.println(maxDepth(root));
    }
    public static int maxDepth(Tree_Node root) {
        if(root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
