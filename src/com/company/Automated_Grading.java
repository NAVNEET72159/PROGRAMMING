package com.company;

import java.util.Scanner;

public class Automated_Grading {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int newGrade[] = new int[n];
        for (int i = 0; i < n; i++) {
            int grade = sc.nextInt();
            if(grade<40 && grade>=38) {
                newGrade[i] = grade+2;
            }
            else if (grade > 40 && (grade+2)%5 == 0) {
                newGrade[i] = grade+2;
            }
            else {
                newGrade[i] = grade;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(newGrade[i]);
        }
    }
}

