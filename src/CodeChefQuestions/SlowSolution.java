package CodeChefQuestions;

import java.util.Scanner;
public class SlowSolution {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int maxT = sc.nextInt();
            int maxN = sc.nextInt();
            int sumN = sc.nextInt();
            int total = 0;
            int temp = maxN;
            while (maxT-->0 && temp<=sumN) {
                if ((sumN-temp)>=maxN) {
                    total += Math.pow(maxN, 2);
                    temp += maxN;
                }
                if (sumN == temp) {
                    total += Math.pow(maxN, 2);
                    temp += maxN;
                }
                if ((sumN-temp) < maxN){
                    total += Math.pow((sumN-temp), 2);
                    temp += maxN;
                }
            }
            System.out.println(total);
        }
    }
}
