class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        backtracking(board,ans,0);
        return ans;
        
    }
    public void backtracking(char[][] board,List<List<String>> ans ,int r){
        if(r == board.length){
            List<String> cp = new ArrayList<>();
            for(char[] row:board){
                cp.add(new String(row));
            }
            ans.add(cp);
            return;
        }
        for(int c = 0;c<board[0].length;c++){
            if(isSafe(board,c,r)){
                board[r][c] = 'Q';
                backtracking(board,ans,r+1);
                board[r][c] = '.';
            }
        }
    }
    
    public boolean isSafe(char[][] board,int c,int r){
        
        for(int i = 0;i<r;i++){
            if(board[i][c] == 'Q'){
                return false;
            }
        }
        int leftmax = Math.min(r,c);
        for(int i = 1;i<=leftmax;i++){
            if(board[r-i][c-i] == 'Q'){
                return false;
            }
        }
        int rightmax = Math.min(r,board.length-c-1);
        for(int i =1;i<=rightmax;i++){
            if(board[r-i][c+i] == 'Q'){
                return false;
            }
        }
        return true;
    }

}