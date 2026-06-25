class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        for(int r=0;r<n;r++){
            for(int c = 0;c<m;c++){
                if(matrix[r][c] == target) return true;
            }
        }
        return false;
    }
}
