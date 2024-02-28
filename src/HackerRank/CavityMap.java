package HackerRank;

import java.util.List;

public class CavityMap {
    public static void main(String[] args) {
        List<String> grid = List.of("1112", "1912", "1892", "1234");
        System.out.println(cavityMap(grid));
    }
    public static List<String> cavityMap(List<String> grid) {
        int n = grid.size();
        char[][] arr = new char[n][n];
        for(int i = 0; i < n; i++) {
            arr[i] = grid.get(i).toCharArray();
        }
        for(int i = 1; i < n - 1; i++) {
            for(int j = 1; j < n - 1; j++) {
                if(arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1]) {
                    arr[i][j] = 'X';
                }
            }
        }
        for(int i = 0; i < n; i++) {
            grid.set(i, String.valueOf(arr[i]));
        }
        return grid;
    }
}
