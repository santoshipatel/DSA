class Solution {
     public void solve(char[][] board, int row, List<List<String>> ans){
        int n = board.length;
        //Base case
        if(row == n){
            List<String> curr = new ArrayList<>();
            for(int i = 0; i<n; i++){
                String str = "";
                for(int j = 0; j<n; j++){
                    str = str + board[i][j];
                }
                curr.add(str);
            }
            ans.add(curr);
            return;
        }
        for(int j = 0; j<n; j++){
            if(board[row][j] == '.'){
                if(isSafe(board, row, j) == true){
                    board[row][j] = 'Q'; //choose
                    solve(board, row+1, ans); //recursion
                    board[row][j] = '.'; //backtracking
                }
            }
        }
    }
    public boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        //for horizontal
        for(int j = 0; j<n; j++){
            if(board[row][j] == 'Q') return false;
        }
        //for vertically
        for(int i = 0; i<n; i++){
            if(board[i][col] == 'Q') return false;
        }
        //north east diaginal
        int i = row;
        int j = col;
        while(i >= 0 && j < n){ //bahar na aa jae
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }
        //for south east
        i = row;
        j = col;
        while(i < n && j < n){ //bahar na aa jae
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }
        //for south west
        i = row;
        j = col;
        while(i < n && j >= 0){ //bahar na aa jae
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }
        //for north west
        i = row;
        j = col;
        while(i >= 0 && j >= 0){ //bahar na aa jae
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
         char[][] board = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        solve(board, 0, ans);
        return ans;
    }
    }