package com.company;

import java.util.Scanner;

public class Pyramid_Star_pattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int rows, i, j;

        System.out.println("Enter the number of rows to print: ");
        rows = scanner.nextInt();

        for (i=0;i<=rows;i++){
            for (j=rows-i;j>=0;j--){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
