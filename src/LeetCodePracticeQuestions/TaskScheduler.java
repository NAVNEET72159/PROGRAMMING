package LeetCodePracticeQuestions;

public class TaskScheduler {
    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;
        System.out.println(leastInterval(tasks, n));
    }
    public static int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(int task : tasks) {
            count[task-'A']++;
        }
        int max = 0;
        int maxCount = 0;
        for(int i = 0; i < 26; i++) {
            if(count[i] > max) {
                max = count[i];
                maxCount = 1;
            }
            else if(count[i] == max) {
                maxCount++;
            }
        }
        return Math.max(tasks.length, (max-1)*(n+1)+maxCount);
    }
}
