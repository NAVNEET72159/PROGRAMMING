package com.company;

import java.util.Scanner;

public class Challenge_Nine {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-->0) {
            int N = scanner.nextInt();
            String str = String.valueOf(N);
            int i = 1;
            int num = N;
            while (num%9 != 0) {
                String temp = String.valueOf(i).concat(str);
                num = Integer.valueOf(temp);
                i++;
            }
            System.out.println(num);
            int j = 1;
            int num1 = N;
            while (num1 %9 != 0) {
                String temp1 = str.concat(String.valueOf(j));
                num1 = Integer.valueOf(temp1);
                System.out.println(temp1);
                j++;
            }
            System.out.println(num1);
        }
    }
}
