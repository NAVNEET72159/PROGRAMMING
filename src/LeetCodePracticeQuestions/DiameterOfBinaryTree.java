package LeetCodePracticeQuestions;

import static LeetCodePracticeQuestions.BalancedBinaryTree.height;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        Tree_Node root = new Tree_Node(1);
        root.left = new Tree_Node(2);
        root.left.left = new Tree_Node(4);
        root.left.right = new Tree_Node(5);
        root.right = new Tree_Node(3);
        System.out.println(diameterOfBinaryTree(root));
    }
    public static int diameterOfBinaryTree(Tree_Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
    }
    public static int height(Tree_Node root) {
        if(root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }
}
