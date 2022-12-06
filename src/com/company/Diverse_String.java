package com.company;

import java.util.Scanner;

public class Diverse_String {
    public String solution(int A, int B, int C) {
        // write your code in Java SE 8
        String str = " ";
        while (A > 0 || B > 0 || C > 0) {
            if (A > B && B == C) {
                if (A-- > 0) {
                    str = str + "a";
                }
                if (A-- > 0) {
                    str = str + "a";
                }
                if (B-- > 0) {
                    str = str + "b";
                }
                if (A-- > 0) {
                    str = str + "a";
                }
                if (A-- > 0) {
                    str = str + "a";
                }
                if (C-- > 0) {
                    str = str + "c";
                }
                if (A-- > 0) {
                    str = str + "a";
                }
                if (A-- > 0) {
                    str = str + "a";
                }
            } else if (B > A && A == C) {
                if (A-- > 0) {
                    str = str + "a";
                }
                if (B-- > 0) {
                    str = str + "b";
                }
                if (B-- > 0) {
                    str = str + "b";
                }
                if (C-- > 0) {
                    str = str + "c";
                }
                if (A-- > 0) {
                    str = str + "b";
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        Diverse_String diverse_string = new Diverse_String();
        System.out.println(diverse_string.solution(A, B, C));
    }
}
