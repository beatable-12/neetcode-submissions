class Solution {
    public int removeDuplicates(int[] nums) {
       int n = nums.length;
       int left = 1;
       int right = 1;
       while(left<n&&right<n){
        if(nums[left-1] != nums[right]){
            nums[left] = nums[right];
            left++;
        }
        right++;
       }
       return left;
    }
    public void swap(int [] arr,int l,int r){
        int temp =arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}