package CodeChefQuestions;

import javax.sound.midi.SysexMessage;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class ChefJudgesACompetition {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int N = sc.nextInt();
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int B[] = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            int Alice_total_time = 0, maxofAlice = 0, aliceIndex = 0;
            int Bob_total_time = 0, maxofBob = 0, bobIndex = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] > maxofAlice) {
                    maxofAlice = A[i];
                    aliceIndex = i;
                }
            }
            for (int i = 0; i < N; i++) {
                if (B[i] > maxofBob) {
                    maxofBob = B[i];
                    bobIndex = i;
                }
            }
            A[aliceIndex] = 0;
            B[bobIndex] = 0;
            for (int i = 0; i < N; i++) {
                Alice_total_time += A[i];
                Bob_total_time += B[i];
            }
            if (Alice_total_time == Bob_total_time)
                System.out.println("DRAW");
            else if (Alice_total_time < Bob_total_time)
                System.out.println("ALICE");
            else
                System.out.println("BOB");
        }
    }
}
