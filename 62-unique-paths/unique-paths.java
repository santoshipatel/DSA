class Solution {
    public int uniquePaths(int m, int n) {
        int[][] ans = new int[m][n];
        return totalPaths(0, 0, m, n, ans);
    }
    private int totalPaths(int i, int j, int m, int n, int[][] ans) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (i >= m || j >= n) {
            return 0;
        }
        if (ans[i][j] != 0) {
            return ans[i][j];
        }
        int moveDown = totalPaths(i + 1, j, m, n, ans);
        int moveRight = totalPaths(i, j + 1, m, n, ans);
        ans[i][j] = moveDown + moveRight;
        return ans[i][j];
    }
}