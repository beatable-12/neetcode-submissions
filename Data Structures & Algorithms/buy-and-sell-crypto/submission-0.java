class Solution {
    public int maxProfit(int[] nums) {
        int n =nums.length;
        int maxP =0;
        int minP=Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(nums[i]<minP){
                minP=nums[i];
            }else{
                maxP=Math.max(maxP,nums[i]-minP);
            }
        }
        return maxP;
    }
}
