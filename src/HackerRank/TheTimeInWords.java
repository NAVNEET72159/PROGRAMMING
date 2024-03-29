package HackerRank;

public class TheTimeInWords {
    public static void main(String[] args) {
        System.out.println(timeInWords(5, 47));
    }
    public static String timeInWords(int h, int m) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
                "twenty six", "twenty seven", "twenty eight", "twenty nine"};
        if(m == 0)
            return words[h] + " o' clock";
        else if(m == 1)
            return "one minute past " + words[h];
        else if(m == 15)
            return "quarter past " + words[h];
        else if(m == 30)
            return "half past " + words[h];
        else if(m == 45)
            return "quarter to " + words[h+1];
        else if(m == 59)
            return "one minute to " + words[h+1];
        else if(m < 30)
            return words[m] + " minutes past " + words[h];
        else
            return words[60-m] + " minutes to " + words[h+1];
    }
}
