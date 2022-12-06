package com.company;

import java.util.Scanner;

public class Time_Complexity_Calculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double now = System.currentTimeMillis();
        Time_Complexity_Calculation time = new Time_Complexity_Calculation();
        int num = sc.nextInt();
        System.out.println(time.findSum(num));
        System.out.println("Time Taken -> "+(System.currentTimeMillis()-now)+"ms");
    }

    public int findSum(int num) {
        int sum = 0;
        sum = num*(num+1)/2;
        return sum;
    }
}
