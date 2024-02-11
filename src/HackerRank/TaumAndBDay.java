package HackerRank;

public class TaumAndBDay {
    public static void main(String[] args) {
        System.out.println(taumBday(27984,1402, 619246,615589, 247954));
    }
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long result = 0;
        if (bc > wc + z) {
            System.out.println("bc > wc + z");
            result = (long) b * wc + (long) w * wc + (long) b * z;
        } else if (wc > bc + z) {
            System.out.println("wc > bc + z");
            result = (long) b * bc + (long) w * bc + (long) w * z;
        } else {
            System.out.println("else");
            result = ((long) b * bc) + ((long) w * wc);
        }
        return result;
    }
}
