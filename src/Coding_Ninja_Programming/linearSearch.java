package Coding_Ninja_Programming;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int N = scanner.nextInt();
            int[] ele = new int[N];
            for (int j = 0; j < N; j++) {
                ele[j] = scanner.nextInt();
            }
            int X = scanner.nextInt();
            System.out.println(searchElementX(ele, X));
        }
    }
    public static int searchElementX(int[] ele, int X) {
        for (int i = 0; i < ele.length; i++) {
            if (ele[i] == X) {
                return i;
            }
        }
        return -1;
    }
}
