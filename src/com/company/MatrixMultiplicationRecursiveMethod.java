package com.company;

import java.util.Scanner;

public class MatrixMultiplicationRecursiveMethod {
    public static int multiplyMatrix(int A[][], int B[][], int rowA, int colA, int rowB, int colB, int size){
        int[][] C = new int[size][size];
        if (size == 1) {
            C[0][0] = A[rowA][colA] * B[rowB][colB];
        } else {
            int newSize = size / 2;
            
        }
        return rowA;
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.println("Enter the size of array: ");
        N = scanner.nextInt();
        int a[][] = new int[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        int b[][] = new int[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                b[i][j] = scanner.nextInt();
            }

            multiplyMatrix(a, b, 0, 0, 0,0, N);
        }
    }
}
