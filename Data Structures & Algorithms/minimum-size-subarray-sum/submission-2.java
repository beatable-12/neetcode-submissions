class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;   
        int maxWindow = Integer.MAX_VALUE;
        int left=0;
        int right =0;
        int sum =0;
        while(right<n){
            sum += nums[right];
            right++;
            while(sum>=target){
                int currwindow = right-left;
                maxWindow=Math.min(maxWindow,currwindow);
                sum = sum - nums[left];
                left++;
            }

        }    
        return maxWindow == Integer.MAX_VALUE?0:maxWindow;                                 
        
    }
}