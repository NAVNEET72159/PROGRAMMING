package com.company;

import java.util.Scanner;

public class Seperation {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int n, i, count=0;
        System.out.println("Enter the size of array: ");
        n = scanner.nextInt();

        int[] num = new int[n];

        System.out.println("Enter element is array: ");
        for (i=0;i<n;i++){
            num[i] = scanner.nextInt();
        }

        for (i=0;i<n;i++) {
            if (num[i]==0) {
                count++;
            }
        }

        for (i=0;i<count;i++) {
            num[i]=0;
        }
        for (i=count;i<n;i++) {
            num[i]=1;
        }
        for (i=0;i<n;i++) {
            System.out.println(num[i]);
        }
    }
}
