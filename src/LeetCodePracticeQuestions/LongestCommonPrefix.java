package LeetCodePracticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 100};
        int[] arr2 = {1000};
        System.out.println(longestCommonPrefix(arr1, arr2));
    }
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        Node_Common root = new Node_Common();
        for (int num: arr1) {
            insert(root, num);
        }
        int res = 0;
        for (int num: arr2) {
            res = Math.max(res, query(root, num));
        }
        return res;
    }

    private static void insert(Node_Common root, int num) {
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        int m = list.size();
        Node_Common node = root;
        for (int i = m-1; i >= 0; i--) {
            if (node.children[list.get(i)] == null) {
                node.children[list.get(i)] = new Node_Common();
            }
            node = node.children[list.get(i)];
        }
    }

    private static int query(Node_Common root, int num) {
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        int m = list.size();
        Node_Common node = root;
        int res = 0;
        for (int i = m-1; i >= 0; i--) {
            if (node.children[list.get(i)] == null) break;
            node = node.children[list.get(i)];
            res++;
        }
        return res;
    }
}
class Node_Common {
    Node_Common[] children = new Node_Common[10];
    // boolean isEnd = false;
}