package CodeChefQuestions;

import java.util.Scanner;

public class EqualizeAB {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int x = scanner.nextInt();
            if (a < b) {
                Operation1(a, b, x);
            } else if (a > b) {
                Operation2(a, b, x);
            } else {
                System.out.println("YES");
            }
        }
    }

    public static void Operation1(int a, int b, int x) {
        while(a != b && a < b) {
            a += x;
            b -= x;
        }
        if (a == b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void Operation2(int a, int b, int x) {
        while(a != b && a > b) {
            a -= x;
            b += x;
        }
        if (a == b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

