package LeetCodePracticeQuestions;

import java.util.ArrayList;
import java.util.List;

class Tree_Node {
    int val;
    Tree_Node left;
    Tree_Node right;
    Tree_Node(){}
    Tree_Node(int val){
        this.val = val;
    }
    Tree_Node(int val, Tree_Node left, Tree_Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        Tree_Node root = new Tree_Node(1);
        root.right = new Tree_Node(2);
        root.right.left = new Tree_Node(3);
        List<Integer> traverse = inOrderTraversal(root);
        printInorder(root);
    }

    public static List<Integer> inOrderTraversal(Tree_Node root) {
        List<Integer> traverse = new ArrayList<>();
        traverseTree(root, traverse);
        return traverse;
    }
    public static void traverseTree(Tree_Node root, List<Integer> traverse) {
        if (root != null) {
            traverseTree(root.left, traverse);
            traverse.add(root.val);
            traverseTree(root.right, traverse);
        }
    }

    public static void printInorder(Tree_Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }
}
