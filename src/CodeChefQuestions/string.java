package CodeChefQuestions;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String s = scanner.next();
        Solution obj = new Solution();
        System.out.println(obj.solve(N, s));
    }
}
class Solution {
    public int solve(int N, String s){
        // Code Here
        int count = 0;
        for (int i = 0; i < N - 2; i=i+2) {
            if ((s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') && (s.charAt(i+2) == 'a' || s.charAt(i+2) == 'e' || s.charAt(i+2) == 'i' || s.charAt(i+2) == 'o' || s.charAt(i+2) == 'u')) {
                s.replace(s.charAt(i), 'b');

                count++;
            }
            if ((s.charAt(i) != 'a' || s.charAt(i) != 'e' || s.charAt(i) != 'i' || s.charAt(i) != 'o' || s.charAt(i) != 'u') && (s.charAt(i+2) != 'a' || s.charAt(i+2) != 'e' || s.charAt(i+2) != 'i' || s.charAt(i+2) != 'o' || s.charAt(i+2) != 'u')) {
                s.replace(s.charAt(i), 'a');
                System.out.println(s.charAt(i));
                count++;
            }
        }
        for (int i = 1; i < N - 2; i=i+4) {
            if ((s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') && (s.charAt(i+2) == 'a' || s.charAt(i+2) == 'e' || s.charAt(i+2) == 'i' || s.charAt(i+2) == 'o' || s.charAt(i+2) == 'u')) {
                s.replace(s.charAt(i), 'b');
                count++;
            }
            if ((s.charAt(i) != 'a' || s.charAt(i) != 'e' || s.charAt(i) != 'i' || s.charAt(i) != 'o' || s.charAt(i) != 'u') && (s.charAt(i+2) != 'a' || s.charAt(i+2) != 'e' || s.charAt(i+2) != 'i' || s.charAt(i+2) != 'o' || s.charAt(i+2) != 'u')) {
                s.replace(s.charAt(i), 'a');
                count++;
            }
        }
        System.out.println(s);
        return count;
    }
}