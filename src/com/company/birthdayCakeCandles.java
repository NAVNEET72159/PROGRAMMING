package com.company;

import java.util.Scanner;

public class birthdayCakeCandles {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int candlesCount = scanner.nextInt();
        int tallest = 0;
        int frequency = 0;

        for (int i = 0; i < candlesCount; i++) {
            int height = scanner.nextInt();

            if (height>tallest) {
                tallest = height;
                frequency = 1;
            }
            else if (height == tallest) {
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
