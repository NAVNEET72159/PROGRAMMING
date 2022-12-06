package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num, reverse=0, temp;

        System.out.println("Enter ay number: ");
        num = scanner.nextInt();

        temp = num;
        while (temp!=0){
            reverse=reverse*10+temp%10;
            temp=temp/10;
        }
        if (reverse==num)
        {
            System.out.print(num+" is a palindrome number.");
        }
        else{
            System.out.print(num+" is not a palindrome number.");
        }
    }
}
