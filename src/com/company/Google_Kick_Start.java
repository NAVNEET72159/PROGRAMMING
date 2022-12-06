package com.company;

import java.util.*;

public class Google_Kick_Start {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        int l1, l2;

        String S, F;

        for (int i = 0; i < T; i++) {
            System.out.println("Enter Value of S: ");
            S = scanner.next();
            l1 = S.length();

            System.out.println("Enter value of F: ");
            F = scanner.next();
            l2 = F.length();

            int result = operation(T, S, F, l1, l2);

            System.out.println("#Case: " + T + " " + result);
        }
    }

    public static int operation(int Test, String Str1, String Str2, int len1, int len2) {

        int count = 0;
        for (int i = 0; i < len1; ) {
            for (int j = 0; j < len2; j++) {
                char c1 = Str1.charAt(i);
                char c2 = Str2.charAt(j);

                while (c1 != c2) {
                    if (c1 < c2) {
                        c1++;
                        count++;
                    } else if (c1 > c2) {
                        c1--;
                        count++;
                    } else {
                        return count;
                    }
                }
                i = i + 1;
            }
        }
        return count;
    }
}
