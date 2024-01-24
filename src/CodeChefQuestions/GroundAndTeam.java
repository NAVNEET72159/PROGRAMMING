package CodeChefQuestions;

import java.util.Scanner;

public class GroundAndTeam {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int g = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(g-(t/2));
    }
}
