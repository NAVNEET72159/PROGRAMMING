package HackerRank;

public class UptianTree {
    public static void main(String[] args) {
        System.out.println(uptianTree(1));
    }
    public static int uptianTree(int n) {
        int height = 1;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                height++;
            } else {
                height *= 2;
            }
        }
        return height;
    }
}
