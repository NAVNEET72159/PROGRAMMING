package com.company;

import java.util.Scanner;

public class countAppleAndOranges {
    public static void main(String args []) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int apples[] = new int[m];
        for (int i = 0; i < m; i++) {
            apples[i] = scanner.nextInt()+a;
        }

        int oranges[] = new int[n];
        for (int i = 0; i < n; i++){
                oranges[i] = scanner.nextInt()+b;
        }

        countAppleAndOranges obj = new countAppleAndOranges();
        int numApples = obj.countApples(apples, s, t);
        System.out.println(numApples);
        int numOranges = obj.countOranges(oranges, s, t);
        System.out.println(numOranges);
    }

    public static int countApples(int[] apples, int s, int t) {
        int numApple = 0;
        for (int Apple : apples) {
            if (Apple >= s && Apple <= t) {
                numApple += 1;
            }
        }
        return numApple;
    }

    public static int countOranges(int[] oranges, int s, int t) {
        int numOranges = 0;
        for (int Orange : oranges) {
            if (Orange >= s && Orange <= t) {
                numOranges += 1;
            }
        }
        return numOranges;
    }
}
