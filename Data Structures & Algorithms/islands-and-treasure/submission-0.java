class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 0){
                    q.add(new int[]{i,j});
                }
            }
        }
        int [] dr = {-1,0,1,0};
        int [] dc = {0,1,0,-1};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r =  curr[0];
            int c = curr[1];
            for(int i =0;i<4;i++){
                int r2 = r+dr[i];
                int c2 = c+dc[i];
                if(r2>=0 && r2<n && c2>=0 && c2<m && grid[r2][c2] == 2147483647){
                    q.add(new int[]{r2,c2});
                    grid[r2][c2] = grid[r][c] +1;
                }
            }
        }
    }
}
