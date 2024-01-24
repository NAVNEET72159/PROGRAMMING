package CodeChefQuestions;

import java.util.Scanner;
public class Adjacent_Sum_Parity {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int N = sc.nextInt();
            int B[] = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            boolean binary_string = true;
            for (int i = 0; i < N; i++) {
                int total = 0;
                if (i != N-1) {
                    total = (i+1)+(i+2);
                    if (total != B[i]) {
                        binary_string = false;
                        break;
                    }
                }
            }
            if (binary_string == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
