package com.company;

import java.util.Scanner;

public class Right_Star_Pattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int rows, i, j;

        System.out.println("Enter number of rows to print: ");
        rows = scanner.nextInt();

        for (i=0;i<rows;i++){
            for (j=2*(rows-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
