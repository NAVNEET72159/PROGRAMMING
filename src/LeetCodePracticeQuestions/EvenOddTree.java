package LeetCodePracticeQuestions;

import java.util.ArrayDeque;

public class EvenOddTree {
    public static void main(String[] args) {
        Tree_Node root = new Tree_Node(1);
        root.left = new Tree_Node(10);
        root.right = new Tree_Node(4);
        root.left.left = new Tree_Node(3);
        root.right.left = new Tree_Node(7);
        root.right.right = new Tree_Node(9);
        root.left.left.left = new Tree_Node(12);
        root.left.left.right = new Tree_Node(8);
        root.right.left.left = new Tree_Node(6);
        root.right.right.right = new Tree_Node(2);
        System.out.println(isEvenOddTree(root));
    }
    public static boolean isEvenOddTree(Tree_Node root) {
        if(root == null) return false;
        ArrayDeque<Tree_Node> queue = new ArrayDeque<>();
        queue.add(root);
        int level = -1;
        while(!queue.isEmpty()){
            level++;
            int size = queue.size(), prev = 0;
            for(int i = 0; i < size; i++){
                Tree_Node curr = queue.poll();

                if(level == 0 && curr.val % 2 == 0){
                    return false;
                }
                if(i == 0){
                    if((level % 2 == 0 && curr.val % 2 == 1)
                            || (level % 2 == 1 && curr.val % 2 == 0)
                    ){
                        prev = curr.val;
                    }else{
                        return false;
                    }
                }
                else{
                    if (level % 2 == 1){
                        if(curr.val % 2 == 0 && prev > curr.val){
                            prev = curr.val;
                        }else{
                            return false;
                        }
                    }else{
                        if(curr.val % 2 == 1 && prev < curr.val){
                            prev = curr.val;
                        }else{
                            return false;
                        }
                    }
                }

                if(curr.left != null){
                    queue.add(curr.left);
                }

                if(curr.right != null){
                    queue.add(curr.right);
                }

            }
        }
        return true;
    }
}
