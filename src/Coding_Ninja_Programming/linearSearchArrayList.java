package Coding_Ninja_Programming;

import java.util.ArrayList;
import java.util.Scanner;

public class linearSearchArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int N = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>(N);
            for (int j = 0; j < N; j++) {
                list.add(scanner.nextInt());
            }
            int X = scanner.nextInt();
            System.out.println(searchElementX(list, N, X));
        }
    }
    public static int searchElementX(ArrayList<Integer> list, int N, int X) {
            if(list.contains(X)) {
                int index = list.indexOf(X);
                return index;
            }
        return -1;
    }
}
