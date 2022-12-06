package Coding_Ninja_Programming;

import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(checkFibonacii(num));
    }
    public static boolean checkFibonacii(int num) {
        boolean isFibonacii = false;
        if (num == 0 || num == 1) {
            isFibonacii = true;
            return isFibonacii;
        } else {
            int a = 2, b = 3, sum = 0;
            while (sum <= num) {
                sum = a+b;
                a = b;
                b = sum;
                if (sum == num) {
                    isFibonacii = true;
                    break;
                }
            }
        }
        return isFibonacii;
    }
}
