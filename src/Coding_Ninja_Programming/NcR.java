package Coding_Ninja_Programming;

import java.util.Scanner;

public class NcR {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        int factN = factorial(n);
        int factR = factorial(r);
        int facNR = factorial(n-r);
        int result = factN / (factR * facNR);
        System.out.println(result);
    }
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
