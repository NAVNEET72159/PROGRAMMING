package CodeChefQuestions;

import java.util.Scanner;

public class mergeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        printMobileModel(year);
    }
    public static void printMobileModel(int year) {
        if (year >= 2000) {
            System.out.println("K"+(year-2000));
        } else {
            System.out.println("K"+(year-1900));
        }
    }
}
