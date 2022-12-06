package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Faluty_Keyboard {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String T = br.readLine();
        String S = br.readLine();

        int number_of_operation_required = 0;

        for (int i = 0; i < T.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (T.charAt(i) == S.charAt(j)) {
                    if (j == 0) {
                        number_of_operation_required = number_of_operation_required+S.length();
                    } else {
                        number_of_operation_required = number_of_operation_required+S.length()+2;
                    }
                }
            }
        }
        System.out.println(number_of_operation_required);
    }
}
