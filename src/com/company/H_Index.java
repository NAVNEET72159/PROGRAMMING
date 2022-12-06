package com.company;

import java.util.*;

public class H_Index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {

            int n = in.nextInt();
            FTree tree = new FTree(100001);
            System.out.print("Case #"+t+":");
            for (int i = 0; i < n; i++) {
                tree.increment(in.nextInt());
                int min = 1;
                int max = i+1;
                while (max > min) {
                    int mid = (min+max+1)/2;
                    if (tree.sum(mid) < mid) max = mid-1;
                    else min = mid;
                }
                System.out.print(" "+min);
            }
            System.out.println();
        }
        in.close();
    }

    static class FTree {
        int[] tree;
        public FTree(int n) {
            tree = new int[n];
        }
        public void increment(int i) {
            for (;;) {
                tree[i]++;
                if (i==0) return;
                i -= Integer.lowestOneBit(i);
            }
        }
        public int sum(int i) {
            int ans = 0;
            while (i < tree.length) {
                ans += tree[i];
                if (i==0) break;
                i += Integer.lowestOneBit(i);
            }
            return ans;
        }
    }

}