package com.company;

import java.util.Scanner;

public class Centauri_Prime {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();

            for (int t = 1; t <= T; ++t) {
                String kingdom = in.next();
                System.out.println(
                        "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
            }
        }
    }
    private static String getRuler(String kingdom) {
        // TODO: implement this method to determine the ruler name, given the kingdom.
        String ruler = "";
        int len = kingdom.length();
        if(kingdom.charAt(len-1)=='a'||kingdom.charAt(len-1)=='e'||kingdom.charAt(len-1)=='i'||kingdom.charAt(len-1)=='o'||kingdom.charAt(len-1)=='u'||kingdom.charAt(len-1)=='A'||kingdom.charAt(len-1)=='E'||kingdom.charAt(len-1)=='I'||kingdom.charAt(len-1)=='O'||kingdom.charAt(len-1)=='U') {
            ruler = "Alice";
        } else if(kingdom.charAt(len-1) == 'y'||kingdom.charAt(len-1) == 'Y') {
            ruler = "nobody";
        } else {
            ruler = "Bob";
        }
        return ruler;
    }
}
