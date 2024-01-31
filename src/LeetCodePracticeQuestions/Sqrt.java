package LeetCodePracticeQuestions;

public class Sqrt {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }
        int start = 1, end = x;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid == x/mid) {
                return mid;
            }
            else if(mid < x/mid) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return end;
    }
}
