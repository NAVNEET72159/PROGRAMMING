package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Happy_New_Year_In_Advance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while (T-->0) {
            int M = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            int arr[] = new int[N];
            int bb = 0;
            int ans = (int) 1e9;
            for (int i = 0; i < M; i++){
                PriorityQueue<Integer> queue = new PriorityQueue<>();
                for (int j = 0; j < N; j++) {
                    int l = Integer.parseInt(br.readLine());
                    arr[j] = Math.max(arr[j],l);
                    queue.add(l);
                    if (queue.size()>2)
                        queue.poll();
                }
                bb = Math.max(bb, queue.poll());
            }
            for (int i = 0; i < N; i++) {
                ans = Math.min(ans, arr[i]);
            }

            if (M>=N) {
                ans = Math.min(ans, bb);
            }
            System.out.println(ans);
        }
    }
}
