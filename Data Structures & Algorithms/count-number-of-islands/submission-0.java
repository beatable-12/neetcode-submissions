class Solution {
    
    public int numIslands(char[][] grid) {
        int count=0;
       for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] =='1'){
                    count++;
                    dfs(grid,i,j,'1','0');
                }
            }
       }
        return count;
    }
    public void dfs(char[][] image,int r,int c,char old,char color){
        image[r][c] = color;
        //up
        if(r-1>=0 && image[r-1][c]==old){
            dfs(image,r-1,c,old,color);
        }

        //left
        if(c-1>=0 && image[r][c-1]==old){
            dfs(image,r,c-1,old,color);
        }

        //right
        if(c+1<image[0].length && image[r][c+1]==old){
            dfs(image,r,c+1,old,color);
        }

        //down
        if(r+1<image.length && image[r+1][c]==old){
            dfs(image,r+1,c,old,color);
        }
    }
}