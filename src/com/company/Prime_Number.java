package com.company;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num, i, flag=0;

        System.out.print("Enter any number: ");
        num = scanner.nextInt();

        for (i=2;i<=num;i++) {
            if (num%i==0) {
                flag++;
            }
        }
        if (flag==1){
            System.out.print(num+" is a Prime Number");
        }
        else{
            System.out.print(num+" is not a Prime number");
        }
    }
}