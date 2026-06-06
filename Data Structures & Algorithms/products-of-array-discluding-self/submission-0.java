class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        int total = 1;
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i == j) continue;
                total = total*nums[j];
                arr[i] = total;
            }
            total = 1;
        }
        return arr;
    }
}  
