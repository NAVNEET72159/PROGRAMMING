package CodeChefQuestions;

import java.util.Scanner;
import java.util.Stack;

public class WA_Test_Case {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int N = sc.nextInt();
            int S[] = new int[N];
            for (int i = 0; i < N; i++) {
                S[i] = sc.nextInt();
            }
            String str = sc.next();
            int min = Integer.MAX_VALUE;
            Stack<Integer> stack = new Stack<Integer>();
            for (int i = 0; i < N; i++) {
                if (str.charAt(i) == '0') {
                    min = stack_push(stack, S[i], min);
                }
            }
            System.out.println(min);
        }
    }
    static int stack_push(Stack<Integer> stack, int i, int min)
    {
        if (min > i) {
            min = i;
        }
        stack.push(i);
        return min;
    }
}
