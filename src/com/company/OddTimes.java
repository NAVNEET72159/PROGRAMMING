package com.company;

import java.util.Scanner;

public class OddTimes {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        int n, i, j, count=0;
        System.out.println("Enter the size of array: ");
        n=scanner.nextInt();

        int[] num = new int[n];
        System.out.println("Enter elements in array: ");
        for (i=0;i<n;i++) {
            num[i] = scanner.nextInt();
        }

        for (i=0;i<n;i++) {
            for (j=0;j<n;j++) {
                if (num[i]==num[j]){
                    count++;
                }
            }
            if (count%2==0) {
                System.out.println("Number "+num[i]+" is repeating odd times.");
            }
        }
    }
}
