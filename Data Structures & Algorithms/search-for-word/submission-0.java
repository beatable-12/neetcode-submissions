class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        visited = new boolean[n][m];
        for(int r = 0;r<n;r++){
            for(int c = 0;c<m;c++){
                if(dfs(board,word,r,c,0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] arr,String word,int r,int c,int i){
        if(i == word.length()){
            return true;
        }
        if(r<0 || c<0 || r>=arr.length || c>=arr[0].length || arr[r][c]!=word.charAt(i) || visited[r][c]){
            return false;
        }
        visited[r][c] = true;
        boolean ans= ( dfs(arr,word,r-1,c,i+1) ||
                 dfs(arr,word,r,c-1,i+1) ||
                 dfs(arr,word,r+1,c,i+1) ||
                 dfs(arr,word,r,c+1,i+1)
        );
        visited[r][c]=false;
        return ans;
    }
}