package com.company;

import java.io.*;
public class probe {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str0 = br.readLine();
        int len = str0.length();
        int l = len + 1;
        boolean b;
        for (int i = 0; i <= len / 2; i++) {
            if (str0.charAt(i) == '{' && str0.charAt(len - i) == '}') {
                b = true;
            }
            if (str0.charAt(i) == '[' && str0.charAt(len - i) == ']') {
                b = true;
            }

        }
    }
}
