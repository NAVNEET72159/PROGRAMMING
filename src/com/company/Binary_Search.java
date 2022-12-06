package com.company;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Binary_Search obj = new Binary_Search();
        int k=0;
        int N;
        System.out.println("Enter the size of array: ");
        N=scanner.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter key to be searched: ");
        int key = scanner.nextInt();

        int result = obj.BS(arr, k, N, key);

        if (result == -1)
        {
            System.out.println("Key is not present.");
        }
        else{
            System.out.println("Key is present at index place "+(result+1)+".");
        }
    }

    public static int BS(int[] arr, int i, int j, int key){
        int mid = (i+j)/2;
        if (arr[mid] == key) {
            return mid;
        }
        else if (arr[mid] > key) {
            return BS(arr, mid + 1, j, key);
        }
        else if (arr[mid] < key){
            return BS(arr, i, mid - 1, key);
        }
        return -1;
    }
}
