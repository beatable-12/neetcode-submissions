class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        int []arr = new int[n];
        int idx =0;
        k=k%n;
        for(int i = n-k;i<n;i++){
            arr[idx++] = nums[i];
        }
        for(int i =0 ;i<n-k;i++){
            arr[idx++] = nums[i];
        }
        for(int i =0;i<n;i++){
            nums[i] = arr[i];
        }
    }
}