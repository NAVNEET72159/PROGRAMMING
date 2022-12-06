package com.company;

import java.util.Scanner;

public class Maximum_Subarray_Problem {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int N, low = 0, high = 0;
        System.out.println("Enter the Size of array: ");
        N = scanner.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter Elements in array: ");
        for (int i=0;i<N;i++){
            arr[i] = scanner.nextInt();
        }
        BruteForce(arr);
        int result = BruteForce(arr);
        System.out.println(result);
    }
    public static int BruteForce(int[] arr){
        int n = arr.length;
        int max_SubArray_Sum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for (int left = 0; left < n; left++) {
            int runningWindowSum = 0;
            for (int right = left; right < n; right++) {
                runningWindowSum = runningWindowSum+arr[right];
                if (runningWindowSum > max_SubArray_Sum) {
                    max_SubArray_Sum = runningWindowSum;
                    start = left;
                    end = right;
                }
            }
        }
        return max_SubArray_Sum;
    }
}
