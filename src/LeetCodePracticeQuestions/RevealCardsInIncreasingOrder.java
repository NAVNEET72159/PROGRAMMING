package LeetCodePracticeQuestions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {
    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7};
        int[] result = deckRevealedIncreasing(deck);
        for(int i : result) {
            System.out.print(i + " ");
        }
    }
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] result = new int[n];
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            queue.add(i);
        }
        for (int j : deck) {
            result[queue.poll()] = j;
            if (!queue.isEmpty()) {
                queue.add(queue.poll());
            }
        }
        return result;
    }
}
