package HackerRank;

public class SaveThePrisoners {
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(5, 2, 1));
    }
    public static int saveThePrisoner(int n, int m, int s) {
        return (s + m - 2) % n + 1;
    }
}
