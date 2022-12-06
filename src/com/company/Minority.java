package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minority {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String s = br.readLine();
            int count_0 = 0, count_1 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    count_0++;
                } else
                    count_1++;
            }
            if (count_0==count_1) {
                System.out.println(0);
            }
            else 
                System.out.println(Math.min(count_0,count_1));
        }
    }
}
