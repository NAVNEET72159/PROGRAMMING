package LeetCodePracticeQuestions;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, visited, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(char[][] board, boolean[][] visited, int i, int j, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }
        visited[i][j] = true;
        if (dfs(board, visited, i+1, j, word, index+1) || dfs(board, visited, i-1, j, word, index+1) || dfs(board, visited, i, j+1, word, index+1) || dfs(board, visited, i, j-1, word, index+1)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
