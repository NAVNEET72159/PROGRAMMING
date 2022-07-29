package com.company;

import java.util.Scanner;

public class Permutation_Count {
    public static void main(String args[] ){
        Scanner s = new Scanner(System.in);
        int T;

        T = s.nextInt();

        for(int i = 0; i < T; i++)
        {

            int count = 1;
            int S, A;
            A = s.nextInt();
            S = s.nextInt();

            int subs = A;

            while(subs > S)
            {
                if(subs >= S) {
                    subs = subs-S;
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println(count);
            }
            else
            {
                System.out.println(count-1);
            }
        }
    }
}
