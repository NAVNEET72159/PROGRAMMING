package CodeChefQuestions;

import java.util.Scanner;

public class QZFIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        if (D == A || D == B || D == C)  {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
