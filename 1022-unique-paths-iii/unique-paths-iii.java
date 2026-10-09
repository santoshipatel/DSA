class Solution {
    public int uniquePathsIII(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        int nonObstacles = 0;
        int startRow = -1;
        int startCol = -1;

        // Count non-obstacle cells and find starting position
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != -1) {
                    nonObstacles++;
                }
                if (grid[i][j] == 1) {
                    startRow = i;
                    startCol = j;
                }
            }
        }

        return dfs(grid, startRow, startCol, nonObstacles);
    }

    private int dfs(int[][] grid, int r, int c, int count) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Base Conditions: Out of bounds or obstacle / already visited
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == -1) {
            return 0;
        }

        // Reached destination cell
        if (grid[r][c] == 2) {
            // Check if all non-obstacle cells have been visited
            return count == 1 ? 1 : 0;
        }

        // Backtracking setup: Mark current cell as visited
        int temp = grid[r][c];
        grid[r][c] = -1;

        // Explore all 4 directions
        int totalPaths = dfs(grid, r + 1, c, count - 1)
                       + dfs(grid, r - 1, c, count - 1)
                       + dfs(grid, r, c + 1, count - 1)
                       + dfs(grid, r, c - 1, count - 1);

        // Backtracking cleanup: Restore original cell value
        grid[r][c] = temp;

        return totalPaths;
    }
}