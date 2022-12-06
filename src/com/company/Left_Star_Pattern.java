package com.company;

import java.util.Scanner;

public class Left_Star_Pattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Rows, i, j;

        System.out.println("Enter number of rows to be print: ");
        Rows = scanner.nextInt();

        for (i=0;i<=Rows;i++){
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
