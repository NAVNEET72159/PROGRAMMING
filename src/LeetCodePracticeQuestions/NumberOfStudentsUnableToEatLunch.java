package LeetCodePracticeQuestions;

public class NumberOfStudentsUnableToEatLunch {
    public static void main(String[] args) {
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};
        System.out.println(countStudents(students, sandwiches));
    }
    public static int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for(int student : students) {
            count[student]++;
        }
        for(int sandwich : sandwiches) {
            if(count[sandwich] == 0) {
                break;
            }
            count[sandwich]--;
        }
        return count[0] + count[1];
    }
}
