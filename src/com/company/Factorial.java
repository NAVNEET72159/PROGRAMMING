package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num, i, fact=1;

        System.out.println("Enter the number you want the factorial of: ");
        num = scanner.nextInt();

        for (i=num;i>0;i--){
            fact = fact*i;
        }
        System.out.print(fact+" is the factorial value of "+num);
    }
}