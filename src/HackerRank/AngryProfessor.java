package HackerRank;

public class AngryProfessor {
    public static void main(String[] args) {
        int k = 3;
        int[] a = {-1, -3, 4, 2};
        System.out.println(angryProfessor(k, a));
    }
    public static String angryProfessor(int k, int[] a) {
        int count = 0;
        for (int j : a) {
            if (j <= 0) {
                count++;
            }
        }
        return count < k ? "YES" : "NO";
    }
}
