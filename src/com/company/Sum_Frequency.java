package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sum_Frequency {
    static Reader sc = new Reader();
    public static void main(String args[]) throws IOException {

        int N = sc.nextInt();

        Map<Integer, Integer> frequency = new HashMap<>();
        TreeMap<Integer, Long> count = new TreeMap<>();

        for (int i = 0; i < N; ++i) {
            int temp = sc.nextInt();
            int count2 = frequency.getOrDefault(temp, 0);
            frequency.put(temp, ++count2);
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            long sum = count.getOrDefault(value, 0l);
            sum += key * value;
            count.put(value, sum);
        }

        long previous = 0l;
        for (int key : count.keySet()) {
            long temp = count.get(key);
            count.put(key, temp + previous);
            previous += temp;
        }

        int Q = sc.nextInt();

        for (int i = 0; i < Q; ++i) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            long ans = 0l;

            Integer start = count.floorKey(l - 1);
            Integer end = count.floorKey(r);

            if (start == null) {
                ans = count.get(end);
            } else {
                ans = count.get(end) - count.get(start);
            }

            System.out.println(ans);
        }
    }
}
