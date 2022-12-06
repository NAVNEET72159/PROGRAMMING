package com.company;


import java.util.Scanner;

public class ReverseAndConcatenate {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-->0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            String s = scanner.next();
            String rev = new StringBuffer(s).reverse().toString();

            if(s.length() == n) {
                ReverseAndConcatenate obj = new ReverseAndConcatenate();
                obj.check(s, k, n);
            }
        }
    }
    public void check(String s, int k, int n) {
        if (k==0) {
            System.out.println("1");
        }else if (k>=1) {
            boolean result = checkPalin(s, n);
            if (result == true) {
                System.out.println("1");
            } else
                System.out.println("2");
        }
    }

    public boolean checkPalin(String s, int n) {
        int start = 0, end = n-1;
        while (start<end){
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
