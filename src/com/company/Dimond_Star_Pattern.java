package com.company;

import java.util.Scanner;

public class Dimond_Star_Pattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int rows, i, j;

        System.out.println("Enter the number of rows to print: ");
        rows = scanner.nextInt();

        for (i=0;i<=rows;i++){
            for (j=rows-i;j>=0;j--){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int count=1;
        for (i=0;i<=rows-1;i++){
            for (j=0;j<count;j++){
                System.out.print(" ");
            }
            count++;
            for (j=0;j<=rows-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
