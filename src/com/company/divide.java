package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class divide {
    public static void main(String [] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int num[] = new int[n];
        int c = 0;
        for(int i = 0; i < n; i++)
        {
            num[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < n-1; i++) {     //for (int i = 0; i < n; i++)
            for (int j = i+1; j<n ; j++) { //for(int j = 0; (j < n && j != i); j++)
                if((num[i]+num[j])%k == 0) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }

}
