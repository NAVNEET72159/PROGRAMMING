package com.company;

import java.util.Scanner;

public class kangaroo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();

        int firstKangaroo = x1;
        int secondKangaroo = x2;

        if (x1 > x2 && v1 < v2) {
            while (firstKangaroo>secondKangaroo) {
                firstKangaroo+=v1;
                secondKangaroo+=v2;
            }
            if (firstKangaroo == secondKangaroo) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
        else if (x1 < x2 && v1 < v2) {
            while (firstKangaroo < secondKangaroo) {
                firstKangaroo+=v1;
                secondKangaroo+= v2;
            }
            if (firstKangaroo == secondKangaroo) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
        else
            System.out.println("NO");
    }
}
