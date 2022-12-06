package com.company;

import java.util.Scanner;

public class Peterson_Number {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int num, sum=0, fact=1, no, temp;

        System.out.println("Enter any number: ");
        num = scanner.nextInt();

        no=num;
        while (no!=0){
            temp = no%10;
            for (int i=1;i<=temp;i++){
                fact = fact*i;
            }
            sum = sum+fact;
            no = no/10;
            fact=1;
        }
        if (num==sum){
            System.out.println("Is an Peterson Number.");
        }else {
            System.out.println("Is not a Peterson Number.");
        }
    }
}
