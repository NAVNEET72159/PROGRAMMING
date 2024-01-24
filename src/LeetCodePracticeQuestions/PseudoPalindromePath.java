package LeetCodePracticeQuestions;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

}

public class PseudoPalindromePath {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.right = new TreeNode(1);
        root.right = new TreeNode(1);
        System.out.println(pseudoPalindromicPaths(root));
    }

    public static int pseudoPalindromicPaths(TreeNode root) {
        int[] count = new int[10];
        return dfs(root, count);
    }

    public static int dfs(TreeNode root, int[] count) {
        if (root == null) {
            return 0;
        }
        count[root.val]++;
        if (root.left == null && root.right == null) {
            int odd = 0;
            for (int i = 1; i <= 9; i++) {
                if (count[i] % 2 == 1) {
                    odd++;
                }
            }
            count[root.val]--;
            if (odd > 1) {
                return 0;
            } else {
                return 1;
            }
        }
        int left = dfs(root.left, count);
        int right = dfs(root.right, count);
        count[root.val]--;
        return left + right;
    }
}
