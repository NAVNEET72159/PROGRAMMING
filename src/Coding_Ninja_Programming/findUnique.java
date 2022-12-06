package Coding_Ninja_Programming;

import java.util.Scanner;

public class findUnique {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-->0) {
            int N = scanner.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            sort(arr, 0, arr.length-1);
            display(arr);
        }
    }
    public static void sort(int[] arr, int start, int end) {
        int middle;
        if (start < end) {
            middle = (start+end)/2;
            sort(arr, start, middle);
            sort(arr, middle+1, end);
            merge(arr, start, middle, end);
        }
    }
    public static void merge(int[] arr, int start, int middle, int end) {
        int low = middle - start + 1;
        int high = end - middle;

        int L[] = new int[low];
        int R[] = new int[high];

        for (int i = 0; i < low; i++) {
            L[i] = arr[start + i];
        }

        for (int i = 0; i < high; i++) {
            R[i] = arr[middle + 1 + i];
        }

        int k = start;
        int i = 0, j = 0;

        while (i < low && j < high) {
            if (L[i] <= R[i]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < low) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < high) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
