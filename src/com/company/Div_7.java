package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Div_7 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int num = Integer.parseInt(br.readLine());
            int ans = (num/7)*7;
            if (num/7 != ans/7)
                ans+=7;
                System.out.println(ans);
        }
    }
}
