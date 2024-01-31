package LeetCodePracticeQuestions;

public class DailyTemperature {
    public static void main(String[] args) {
        int[] T = {73,74,75,71,69,72,76,73};
        int[] ans = dailyTemperatures(T);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        int[] stack = new int[temperatures.length];
        int top = -1;
        for(int i=0;i<temperatures.length;i++) {
            while(top != -1 && temperatures[stack[top]] < temperatures[i]) {
                ans[stack[top]] = i - stack[top];
                top--;
            }
            stack[++top] = i;
        }
        return ans;
    }
}
