class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        int low =0;
        int high =n*m-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int c = mid%m;
            int r = mid/m;
            if(matrix[r][c]== target){
                return true;
            }else if(matrix[r][c]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }

}