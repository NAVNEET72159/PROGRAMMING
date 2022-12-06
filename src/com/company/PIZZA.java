package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PIZZA {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int no_of_clients;
        no_of_clients = scanner.nextInt();

        ArrayList<String> likedIngredients = new ArrayList<>();

        while (no_of_clients-->0) {

            int liked = scanner.nextInt();
            for (int i = 0; i < liked; i++) {
                String s = scanner.next();
                if (likedIngredients.contains(s)) {
                    likedIngredients.remove(s);
                }
                likedIngredients.add(s);
            }
            int unliked = scanner.nextInt();
            String unlikedIngredient[] = new String[unliked];
            if (unliked != 0) {
                for (int i = 0; i < unliked; i++) {
                    unlikedIngredient[i] = scanner.next();
                }

                for (int i = 0; i < unliked; i++) {
                    if (likedIngredients.contains(unlikedIngredient[i])) {
                        likedIngredients.remove(unlikedIngredient[i]);
                    }
                }
            }
        }
        System.out.print(likedIngredients.size()+" "+likedIngredients+" ");
    }
}
