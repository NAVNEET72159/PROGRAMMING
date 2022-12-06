package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Double_On_Match {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int arr[] = new int[n];
        int num = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for(int  i = 0; i < n; i++) {
            if(arr[i] == n){
                num = num+1;
                System.out.println(num);
            }
            else {
                System.out.println(num);
            }
        }
    }
}
