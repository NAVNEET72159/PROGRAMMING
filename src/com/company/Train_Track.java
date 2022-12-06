package com.company;

import java.util.Scanner;

public class Train_Track {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            String X = sc.next();
            int count = 0;
            for (int i = 0; i < X.length(); i++) {
                if (X.charAt(i)=='4') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
