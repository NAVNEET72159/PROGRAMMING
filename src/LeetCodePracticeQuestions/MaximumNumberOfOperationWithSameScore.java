package LeetCodePracticeQuestions;

public class MaximumNumberOfOperationWithSameScore {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        System.out.println(maxOperations(arr));
    }
    public static int maxOperations(int[] arr) {
        int count = 0;
        int freq = 0;
        for(int i = 0; i < arr.length-1; i+=2) {
            if(i == 0) {
                freq = arr[i] + arr[i + 1];
            }
            if(arr[i] + arr[i + 1] == freq) {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }
}
