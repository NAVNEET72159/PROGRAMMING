package HackerRank;

public class PickingNumbers {
    public static void main(String[] args) {
        int[] a = {4, 6, 5, 3, 3, 1};
        System.out.println(pickingNumbers(a));
    }
    public static int pickingNumbers(int[] a) {
        int[] count = new int[100];
        for (int j : a) {
            count[j]++;
        }
        int max = 0;
        for(int i = 1; i < 100; i++) {
            max = Math.max(max, count[i] + count[i-1]);
        }
        return max;
    }
}
