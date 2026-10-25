import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        solve(grid, 0, ans);
        return ans;
    }

    private void solve(char[][] grid, int row, List<List<String>> ans) {
        int n = grid.length;
        if (row == n) {
            List<String> curr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String str = "";
                for (int j = 0; j < n; j++) {
                    str = str + grid[i][j];
                }
                curr.add(str);
            }
            ans.add(curr);
            return;
        }

        for (int j = 0; j < n; j++) {
            if (grid[row][j] == '.') {
                if (isSafe(grid, row, j)) {
                    grid[row][j] = 'Q'; // select
                    solve(grid, row + 1, ans); // recursion
                    grid[row][j] = '.'; // backtracking
                }
            }
        }
    }

    private boolean isSafe(char[][] grid, int row, int col) {
        int n = grid.length;
        
        // Check upper column
        for (int i = 0; i < row; i++) {
            if (grid[i][col] == 'Q') return false;
        }
        
        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (grid[i][j] == 'Q') return false;
        }
        
        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (grid[i][j] == 'Q') return false;
        }
        
        return true;
    }
}