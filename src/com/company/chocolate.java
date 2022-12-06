package com.company;

import java.io.*;
public class chocolate {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int s[] = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(br.readLine());
        }
        int d = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int count = 0;
        int sum = 0;
        for (int i = 0; i < m-1; i++) {
            sum = sum + s[i];
        }

        for (int i = m-1; i < n; i++) {
            if ((i-m)<0)
                sum = sum-0;
            else
                sum = sum - s[i-m];
            sum = sum + s[i];
            if(sum == d)
                count++;
        }
        System.out.println(count);
    }
}
