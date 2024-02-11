package HackerRank;

public class Encryption {
    public static void main(String[] args) {
        System.out.println(encryption("haveaniceday"));
    }
    public static String encryption(String s) {
        s = s.replaceAll("\\s", "");
        int len = s.length();
        int row = (int) Math.floor(Math.sqrt(len));
        int col = (int) Math.ceil(Math.sqrt(len));
        if (row * col < len) {
            row = col;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < col; i++) {
            for (int j = i; j < len; j += col) {
                sb.append(s.charAt(j));
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
