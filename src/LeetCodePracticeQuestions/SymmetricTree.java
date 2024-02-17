package LeetCodePracticeQuestions;

class Tree_Node_1 {
    int val;
    Tree_Node_1 left;
    Tree_Node_1 right;

    Tree_Node_1(int val) {
        this.val = val;
    }

}
public class SymmetricTree {
    public static void main(String[] args) {
        Tree_Node_1 root = new Tree_Node_1(1);
        root.left = new Tree_Node_1(2);
        root.left.left = new Tree_Node_1(3);
        root.left.right = new Tree_Node_1(4);
        root.right = new Tree_Node_1(2);
        root.right.left = new Tree_Node_1(4);
        root.right.right = new Tree_Node_1(3);
        System.out.println(isSymmetric(root));
    }
    public static boolean isSymmetric(Tree_Node_1 root) {
        return isMirror(root, root);
    }
    public static boolean isMirror(Tree_Node_1 t1, Tree_Node_1 t2) {
        if(t1 == null && t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
