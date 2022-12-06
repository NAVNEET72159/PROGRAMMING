package com.company;

import java.util.Scanner;

public class Integer_To_String_Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, len, rev, temp;
        String[] OneDigitNumber = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] TwoDigitNumber = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Eighteen", "Nineteen"};
        String[] MultipleOften = new String[]{"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] MoreThanTwoDigitNumber = new String[]{"Hundred", "Thousand"};

        System.out.println("Enter any number: ");
        num = scanner.nextInt();

        Integer n = new Integer(num);
        String s = n.toString();
        len = s.length();

        if (len == 1) {
            System.out.println("String value of number is: " + OneDigitNumber[num]);
        }
        rev = num;
        if (len == 2 && rev / 10 == 1) {
            System.out.println("String value of number is: " + TwoDigitNumber[rev % 10]);
        } else if (len == 2 && rev % 10 != 0) {
            System.out.println("String value of number is: " + MultipleOften[(rev / 10) - 2] + "" + OneDigitNumber[rev % 10]);
        } else if (len == 2) {
            System.out.println("String value of number is: " + MultipleOften[(rev / 10 - 2)]);
        }
        if (len == 3 && rev % 100 != 0) {
            temp = rev % 100;
            if (temp / 10 == 0 && temp % 10 != 0) {
                System.out.println("String value of number is: " + OneDigitNumber[rev / 100] + "" + MoreThanTwoDigitNumber[0] + "" + OneDigitNumber[temp % 10]);
            } else if (temp / 10 == 1) {
                System.out.println("String value of number is: " + OneDigitNumber[rev / 100] + "" + MoreThanTwoDigitNumber[0] + "" + TwoDigitNumber[temp % 10]);
            } else if (temp % 10 != 0) {
                System.out.println("String value of number is: " + OneDigitNumber[rev / 100] + "" + MoreThanTwoDigitNumber[0] + "" + MultipleOften[(temp / 10) - 2] + "" + OneDigitNumber[temp % 10]);
            } else {
                System.out.println("String value of number is: " + OneDigitNumber[rev / 100] + "" + MoreThanTwoDigitNumber[0] + "" + MultipleOften[(temp / 10) - 2]);
            }
        } else if (len == 3) {
            System.out.println("String value of number is: " + OneDigitNumber[rev / 100] + "" + MoreThanTwoDigitNumber[0]);
        }
        if (len == 4 && rev % 1000 != 0) {
            temp = rev % 1000;
            if (temp % 100 != 0) {
                int temp2 = temp % 100;
                if (temp2 / 10 == 0 && temp2 % 10 != 0) {
                    System.out.println("String value of number is: " + OneDigitNumber[rev / 1000] + "" + MoreThanTwoDigitNumber[1] + "" + OneDigitNumber[temp2 % 10]);
                } else if (temp2 / 10 == 1) {
                    System.out.println("String value of number is: " + OneDigitNumber[rev / 1000] + "" + MoreThanTwoDigitNumber[1] + "" + OneDigitNumber[temp / 100] + "" + MoreThanTwoDigitNumber[0] + "" + MultipleOften[temp2 % 10]);
                } else if (temp2 % 10 != 0) {
                    System.out.println("String value of number is: " + OneDigitNumber[rev / 1000] + "" + MoreThanTwoDigitNumber[1] + "" + OneDigitNumber[temp / 100] + "" + MoreThanTwoDigitNumber[0] + "" + MultipleOften[(temp2 / 10) - 2] + "" + OneDigitNumber[temp2 % 10]);
                } else {
                    System.out.println("String value of number is: " + OneDigitNumber[rev / 1000] + "" + MoreThanTwoDigitNumber[1] + "" + OneDigitNumber[temp / 100] + "" + MoreThanTwoDigitNumber[0] + "" + MultipleOften[(temp2 / 10) - 2]);
                }
            }
        } else if (len == 4) {
            System.out.println("String value of number is: " + OneDigitNumber[rev / 1000] + "" + MoreThanTwoDigitNumber[1]);
        }
    }
}
