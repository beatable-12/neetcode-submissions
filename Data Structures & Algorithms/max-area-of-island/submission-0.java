class Solution {
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    dfs(grid,i,j,visited);
                    max=Math.max(max,count);
                    count =0;
                }
               
            }
             
           
        }
        return max;
    }
    

    public void dfs(int[][] grid,int r,int c,boolean[][] visited){
        visited[r][c]=true;
        count++;
        //up
        if(r-1>=0 && grid[r-1][c]==1 && !visited[r-1][c]){
            visited[r-1][c] = true;
            dfs(grid,r-1,c,visited);
        }

        //left
        if(c-1>=0 && grid[r][c-1]==1 && !visited[r][c-1]){
            visited[r][c-1] = true;
            dfs(grid,r,c-1,visited);
        }
        //right
        if(c+1<grid[0].length && grid[r][c+1]==1 && !visited[r][c+1]){
            visited[r][c+1] = true;
            dfs(grid,r,c+1,visited);
        }
        //down
        if(r+1<grid.length && grid[r+1][c] == 1 && !visited[r+1][c]){
            visited[r+1][c] = true;
            dfs(grid,r+1,c,visited);
        }
    }
}