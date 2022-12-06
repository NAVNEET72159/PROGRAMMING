package com.company;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num, no, square, temp=0, len, c=1, rev=0;

        System.out.println("Enter any number: ");
        num = scanner.nextInt();

        square = num*num;
        Integer n=new Integer(num);
        String str = n.toString();
        len = str.length();
        no=square;

        while (c<=len){
            temp = temp*10+(no%10);
            no=no/10;
            c++;
        }
        while (temp!=0){
            rev=rev*10+(temp%10);
            temp=temp/10;
        }
        if (rev==num){
            System.out.println("Is an ArmStrong Number.");
        }else{
            System.out.println("Is not an ArmStrong Number.");
        }
    }
}
