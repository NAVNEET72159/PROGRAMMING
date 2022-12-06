package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XZY {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int num = Integer.parseInt(bufferedReader.readLine());
        System.out.println(num);
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                num = num*2;
            }
            System.out.println(num);
        }
    }
}