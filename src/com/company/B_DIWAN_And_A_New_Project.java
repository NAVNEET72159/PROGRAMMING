package com.company;

import java.util.*;

public class B_DIWAN_And_A_New_Project {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {
            t--;
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            TreeMap<Long, ArrayList<Long>> treeMap = new TreeMap<>(Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                ArrayList<Long> arrayList = new ArrayList<>();
                if (treeMap.containsKey((long)(arr[i]))) {
                    arrayList = treeMap.get((long)arr[i]);
                }
                arrayList.add((long)i+1);
                treeMap.put((long)arr[i], arrayList);
            }
            long position = 0, neg = -1, k = 0, time = 0;
            long ans[] = new long[n+1];
            ans[0] = 0;
            for (Map.Entry<Long, ArrayList<Long>> entry : treeMap.entrySet()) {
                ArrayList<Long> arrayList = entry.getValue();
                for (long i : arrayList) {
                    if (k%2 == 0){
                        ans[(int)i] = position;
                        time += 2*position*entry.getKey();
                        position++;
                    } else {
                        ans[(int)i] = neg;
                        time += 2*position* entry.getKey();
                        neg--;
                    }
                    k++;
                }
            }
            System.out.println(time);
            for (long i : ans) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.close();
    }
}