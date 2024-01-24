package CodeChefQuestions;

import java.util.Scanner;

public class Easy_Pronunciation {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int N = sc.nextInt();
            String str = sc.next();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (str.charAt(i) != 'a'  || str.charAt(i) != 'e' || str.charAt(i) != 'i' || str.charAt(i) != 'o' || str.charAt(i) != 'u') {
                    count++;
                } else {
                    count = 0;
                }
                if (count == 4) {
                        break;
                }
            }
            System.out.println(count);
            if (count < 4)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
