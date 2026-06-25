class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        int low =0;
        int high =m-1;
        for(int i = 0;i<n;i++){
            if(matrix[i][0]<=target && target<=matrix[i][m-1]){
                return binaryS(matrix[i],0,m-1,target);
            }
        }
        return false;
    }

    public boolean binaryS(int[] arr , int low,int high,int target){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]== target){
                return true;
            }else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
}