package HackerRank;

public class SherlockAndSquares {
    public static void main(String[] args) {
        System.out.println(squares(3, 9));
    }
    public static int squares(int a, int b) {
        int count = 0;
        for(int i = a; i <= b; i++) {
            if(Math.sqrt(i) % 1 == 0) {
                count++;
                i += (int)Math.sqrt(i) * 2;
            }
        }
        return count;
    }
}
