package Coding_Ninja_Programming;

import java.util.Scanner;

public class swapAlternate {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-->0) {
            int N = scanner.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < N-1; i = i+2) {
                for (int j = i+1; j < N; j++) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
