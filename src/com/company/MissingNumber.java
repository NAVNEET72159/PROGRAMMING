package com.company;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        int n, i, l, sum, restSum = 0, missing_number;
        System.out.println("Enter the size of array: ");
        n = scanner.nextInt();

        int[] num = new int[n];
        System.out.println("Enter element is array: ");
        for (i=0;i<n;i++){
            num[i] = scanner.nextInt();
        }

        l = num.length+1;
        sum = l*(l+1)/2;
        for (i=0;i<n;i++) {
            restSum += num[i];
        }
        missing_number = sum-restSum;
        System.out.println("Missing number: "+missing_number);
    }
}
