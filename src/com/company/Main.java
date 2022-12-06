package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end, i, sum = 0, num = 1, Sum=0;

        System.out.println("Till where you have to find the Fibnocii Series: ");
        end = scanner.nextInt();

        System.out.print(sum+" "+num);

        while (Sum<end)
        {
            Sum = sum + num;
            System.out.print(" "+Sum);
            sum = num;
            num = Sum;
        }
    }
}
