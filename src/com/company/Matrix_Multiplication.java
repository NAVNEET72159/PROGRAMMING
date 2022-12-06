package com.company;

import java.util.Scanner;

public class Matrix_Multiplication {
    public static void multiplication(int a[][], int b[][], int R1, int C1, int R2, int C2) {

        //if matrix is unequal
        if (R2 != C1 && R1 == C2) {

            int result1[][] = new int[R2][C1];

            for (int i = 0; i < R2; i++) {
                for (int j = 0; j < C1; j++) {
                    for (int k = 0; k < R1; k++) {

                        result1[i][j] += a[i][k] * b[k][j];
                        printMartix(result1, R2, C1);

                    }
                }
            }
        } else if (R1 != C2 && R2 == C1) {

            int result2[][] = new int[R1][C2];

            for (int i = 0; i < R1; i++) {
                for (int j = 0; j < C2; j++) {
                    for (int k = 0; k < R2; k++) {

                        result2[i][j] += a[i][k] * b[j][k];
                        printMartix(result2, R1, C2);

                    }
                }
            }
        }

        //if matrix sizes are equal
        else if (R1 == C2 && R2 == C1) {

            int result3[][] = new int[R1][C1];

            for (int i = 0; i < R1; i++) {
                for (int j = 0; j < C1; j++) {
                    for (int k = 0; k < R1; k++) {

                        result3[i][j] += a[i][k] * b[k][j];
                        printMartix(result3, R1, C1);

                    }
                }
            }
        } else {

            System.out.println("Multiplication is not possible.");

        }
    }

    public static void printMartix(int result[][], int Row, int Column) {

        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        int Row1, Column1, Row2, Column2;

        System.out.println("Enter the number of rows of first matrix: ");
        Row1 = scanner.nextInt();
        System.out.println("Enter the number of columns of first matrix: ");
        Column1 = scanner.nextInt();
        System.out.println("Enter the number of rows of second matrix: ");
        Row2 = scanner.nextInt();
        System.out.println("Enter the number of columns of second matrix: ");
        Column2 = scanner.nextInt();

        int arr1[][] = new int[Row1][Column1];
        int arr2[][] = new int[Row2][Column2];

        System.out.println("Enter elements in array of first matrix: ");
        for (int i = 0; i < Row1; i++) {
            for (int j = 0; j < Column1; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements in array of second matrix: ");
        for (int i = 0; i < Row2; i++) {
            for (int j = 0; j < Column2; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }
        multiplication(arr1, arr2, Row1, Column1, Row2, Column2);
    }
}