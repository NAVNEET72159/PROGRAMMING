package com.company;

import java.util.Scanner;

public class bitwiseAND {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while(t != 0) {
            t--;
            int m  = scanner.nextInt();
            int arr[] = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = scanner.nextInt();
            }

            bitwiseAND obj = new bitwiseAND();
            long result = obj.sum(arr, m);

            System.out.println(result);
        }
    }
    public long sum(int[] arr, int m) {
        long sum = 0;

        int prefAND[] = new int[m];
        int netAND = 0xfffffff;
        for (int i = 0; i < m; i++) {
            netAND &= arr[i];
            prefAND[i] = netAND;
        }

        netAND = 0xfffffff;
        int bitSet[] = new int[26];
        sum = prefAND[m - 2];
        for (int i = m - 2; i > -1; i--) {
            netAND &= arr[i + 1];
            int psw = 1;

            for (int j = 0; j < 26; j++) {
                bitSet[j] += ((netAND & psw) != 0 ? 1 : 0);
                psw *= 2;
            }
            psw = 1;
            int remainder = i != 0 ? prefAND[i - 1] : 0xfffffff;
            int carry = i != 0 ? 1 : 0;
            for (int j = 0; j < 26; j++) {
                if ((psw & remainder) != 0) {
                    sum += (bitSet[j] + carry) * (long)psw;
                }
                psw *= 2;
            }
        }
        return sum;
    }
}