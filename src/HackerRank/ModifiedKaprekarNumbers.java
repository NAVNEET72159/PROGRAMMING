package HackerRank;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        kaprekarNumbers(1, 100);
    }
    public static void kaprekarNumbers(int p, int q) {
        boolean found = false;
        for (int i = p; i <= q; i++) {
            long square = (long) i * i;
            String str = String.valueOf(square);
            int d = String.valueOf(i).length();
            int l = str.length();
            int r = Integer.parseInt(str.substring(l - d));
            int l1 = l - d == 0 ? 0 : Integer.parseInt(str.substring(0, l - d));
            if (l1 + r == i) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("INVALID RANGE");
        }
    }
}
