package LeetCodePracticeQuestions;

public class BitwiseAndOfNumbersRange {
    public static void main(String[] args) {
        int m = 5;
        int n = 7;
        System.out.println(rangeBitwiseAnd(m, n));
    }
    public static int rangeBitwiseAnd(int m, int n) {
        int count = 0;
        while(m != n) {
            m = m >> 1;
            n = n >> 1;
            count++;
        }
        return m << count;
    }
}
