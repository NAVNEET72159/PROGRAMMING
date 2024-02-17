package LeetCodePracticeQuestions;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        Tree_Node root = new Tree_Node(3);
        root.left = new Tree_Node(9);
        root.right = new Tree_Node(20);
        root.right.left = new Tree_Node(15);
        root.right.right = new Tree_Node(7);
        System.out.println(minDepth(root));
    }
    public static int minDepth(Tree_Node root) {
        if(root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }
}
