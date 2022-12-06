package com.company;

import java.util.*;

public class Armstrong {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num, sum=0, temp, rev;

        System.out.println("Enter any number: ");
        num = scanner.nextInt();

        temp=num;

        while (temp!=0){
            rev = temp%10;
            temp = temp/10;
            sum = (int) (sum+Math.pow(rev,3));
        }
        if (num==sum){
            System.out.print(num+" is an Armstrong Number.");
        }
        else{
            System.out.print(num+" is not an ArmStrong number");
        }
    }
}
