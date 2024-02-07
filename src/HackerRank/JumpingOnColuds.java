package HackerRank;

public class JumpingOnColuds {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        int[] c = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnColuds(c, k));
    }
    public static int jumpingOnColuds(int[] c, int k) {
        int energy = 100;
        int i = 0;
        do {
            i = (i + k) % c.length;
            energy--;
            if(c[i] == 1) {
                energy -= 2;
            }
        } while(i != 0);
        return energy;
    }
}
