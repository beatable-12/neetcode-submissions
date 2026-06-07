class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int left=0;
        int right = n-1;
        int leftMax = nums[left],rightMax =nums[right];
        int ans =0;
        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax = Math.max(leftMax,nums[left]);
                ans+=leftMax - nums[left];
            }else{
                right--;
                rightMax = Math.max(rightMax,nums[right]);
                ans +=rightMax - nums[right]; 

            }
        }
        return ans;
    }
}
