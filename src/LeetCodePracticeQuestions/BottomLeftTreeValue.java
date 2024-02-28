package LeetCodePracticeQuestions;

public class BottomLeftTreeValue {
    public static void main(String[] args) {
        Tree_Node root = new Tree_Node(2);
        System.out.println(findBottomLeftValue(root));
    }
    public static int findBottomLeftValue(Tree_Node root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return root.val;
        }
        return findBottomLeftValue(root, 0, new int[]{0, 0});
    }
    public static int findBottomLeftValue(Tree_Node root, int depth, int[] res) {
        if (res[1] < depth) {
            res[0] = root.val;
            res[1] = depth;
        }
        if (root.left != null) {
            findBottomLeftValue(root.left, depth + 1, res);
        }
        if (root.right != null) {
            findBottomLeftValue(root.right, depth + 1, res);
        }
        return res[0];
    }
}
