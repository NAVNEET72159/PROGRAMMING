package Coding_Ninja_Programming;

import java.util.Scanner;

public class arrangeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            arrangeNumber(arr, N);
        }
    }
    public static void arrangeNumber(int[] arr, int N) {
        int left = 0;
        int right = N -1;
        int counter = 1;

        while (left <= right) {
            if (counter % 2 == 1) {
                arr[left] = counter;
                counter += 1;
                left += 1;
            } else {
                arr[right] = counter;
                counter += 1;
                right -= 1;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
