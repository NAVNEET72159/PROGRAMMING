package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Small_Large {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int n, i;
        System.out.println("Enter the size of array: ");
        n = scanner.nextInt();
        int num[] = new int[n];
        System.out.println("Enter numbers in array: ");
        for (i=0;i<n;i++){
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        System.out.println("Smallest Number: "+num[0]+" Second Largest Number: "+num[n-2]);
    }
}