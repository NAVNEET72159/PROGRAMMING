package HackerRank;

public class ChocolateFeast {
    public static void main(String[] args) {
        System.out.println(chocolateFeast(10, 2, 5));
    }
    public static int chocolateFeast(int n, int c, int m) {
        int count = n/c;
        int wrappers = count;
        while(wrappers >= m) {
            int newChocolates = wrappers/m;
            count += newChocolates;
            wrappers = wrappers%m + newChocolates;
        }
        return count;
    }
}
