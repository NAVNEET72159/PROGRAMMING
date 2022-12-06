package com.company;

import java.util.Scanner;

public class Xylem_and_Phloem_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num, n, outer_number_sum=0, Inner_number_sum=0;
        System.out.println("Enter any number: ");
        num = scanner.nextInt();

        n = num;

        while (n!=0){

            if (n == num || n<10){
                Inner_number_sum = Inner_number_sum+n%10;
            }
            else{
                outer_number_sum = outer_number_sum+n%10;
            }
            n = n/10;
        }
        if (Inner_number_sum==outer_number_sum){
            System.out.println("Is a Xylem Number.");
        }else{
            System.out.println("Is a Phloem Number.");
        }
    }
}
