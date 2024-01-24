package CodeChefQuestions;

import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s = sc.nextInt();
        int V = sc.nextInt();
        for (int i = 0; i < s; i = i+3) {
            V = V*2;
        }
        System.out.println(V);
    }
}
