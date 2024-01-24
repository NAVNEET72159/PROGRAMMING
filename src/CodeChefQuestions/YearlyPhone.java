package CodeChefQuestions;

public class YearlyPhone {
    public static void main(String[] args) {
        int year = 2000;
        printMobileModel(year);
    }
    public static void printMobileModel(int year) {
        if (year >= 2000) {
            System.out.println("K"+(year-2000));
        } else if (year >= 1900) {
            System.out.println("K"+(year-1900));
        } else {
            while(year < 1900) {
                year += 100;
        }
            System.out.println("K"+(year-1900));
        }
    }
}
