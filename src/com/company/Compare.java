package com.company;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        String str1, str2;
        char char1, char2, ch;
        System.out.println("**********************COMPARISION APPLICATION**********************\n\n\n\n");
        System.out.println("Enter your choice (1. Numbers, 2. String, 3. Character): ");
        ch = scanner.next().charAt(0);

        switch (ch){
            case '1':
                System.out.print("Enter first number: \n");
                num1 = scanner.nextInt();
                Double x=new Double(num1);
                System.out.print("Enter second number: \n");
                num2 = scanner.nextInt();
                Double y=new Double(num2);

                boolean b = x.equals(y);

                if (b==true){
                    System.out.println("Is equal");
                }
                else{
                    System.out.println("Not equal");
                }
                break;

            case '2':
                System.out.println("Enter first String: ");
                str1 = scanner.next();
                String s1 = new String(str1);
                System.out.println("Enter second String: ");
                str2 = scanner.next();
                String s2 = new String(str2);

                boolean b2 = s1.equals(s2);

                if (b2==true){
                    System.out.println("Is equal");
                }
                else{
                    System.out.println("Not equal");
                }
                break;

            case '3':
                System.out.println("Enter first character: ");
                char1 = scanner.next().charAt(0);
                Character char3 = new Character(char1);
                System.out.println("Enter second character: ");
                char2 = scanner.next().charAt(0);
                Character char4 = new Character(char2);

                boolean b3 = char3.equals(char4);

                if (b3==true){
                    System.out.println("Is equal");
                }
                else{
                    System.out.println("Not equal");
                }
                break;
        }
    }
}
