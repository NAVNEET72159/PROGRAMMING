package HackerRank;

public class FindDigits {
    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }
    public static int findDigits(int num) {
        int count = 0;
        int temp = num;
        while(temp!=0) {
            int last = temp%10;
            temp = temp/10;
            if(last != 0 && num%last == 0)
                count++;
        }
        return count;
    }
}
