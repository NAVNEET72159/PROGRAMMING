package HackerRank;

public class BeautifuulDays {
    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }
    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for(int l = i; l <= j; l++) {
            int reverse = 0;
            int temp = l;
            while(temp != 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }
            if(Math.abs(l - reverse) % k == 0) {
                count++;
            }
        }
        return count;
    }
}
