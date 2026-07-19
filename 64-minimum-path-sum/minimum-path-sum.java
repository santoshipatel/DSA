class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][]ans = new int[row][col];
        ans[0][0] =  grid[0][0];
        // first fill 0th row
        for(int j =1; j<col;j++){
            ans[0][j] = ans[0][j-1] + grid[0][j];
        }
        // for 0th col
            for(int i =1; i<row;i++){
            ans[i][0] = ans[i-1][0] + grid[i][0];

        }
        // no fill the complete ans Array
        for(int i =1; i<row; i++){
            for(int j =1; j<col; j++){
                int r = ans[i-1][j] + grid[i][j];
                int d = ans[i][j-1] + grid[i][j];
                ans[i][j] = Math.min(r,d);
            }
        }
 return ans[row-1][col-1];
        

        
    }
}