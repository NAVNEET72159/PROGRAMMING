package Coding_Ninja_Programming;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int E = scanner.nextInt();
        int W = scanner.nextInt();

        for (int i = S; i <= E; i=i+W) {
            System.out.println(i+"\t"+conversion(i));
        }
    }

    private static double conversion(int i) {
        double cel = (i - 32)*5/9;
        return cel;
    }
}
