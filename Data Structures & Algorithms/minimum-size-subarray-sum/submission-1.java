class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        //int sum =0;
        int len = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            //int curr = 0;
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum >= target){
                    len = Math.min(len,j-i+1);
                    break;
                }
            }
            
        }
        return len == Integer.MAX_VALUE?0:len;
    }
}