package com.company;

import java.util.Scanner;

public class Elemination {
        public int solution(int N) {
            // write your code in Java SE 8
            int num = N;
            int sum = 0;
            int count = 1;
            while(num!=0) {
                int temp = num%10;
                if(temp!=5) {
                    sum = sum*10+temp;
                }
                if (temp==5 && count==0){
                    sum = sum*10+temp;
                } else {
                    count--;
                }
                num = num/10;
            }
            int temp = sum;
            int add = 0;
            while(temp != 0) {
                int k = temp%10;
                add = add*10+k;
                temp = temp/10;
            }
            return add;
        }
        public static void main(String [] args) {
            Scanner scanner = new Scanner(System.in);
            Elemination elemination = new Elemination();
            int N = scanner.nextInt();
            System.out.println(elemination.solution(N));
        }
}
