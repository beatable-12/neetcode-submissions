class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        for(int i:nums){
            l = Math.max(l,i);
            r+=i;
        } 
        int ans = 0;
        while(l<=r){
            int m = l+(r-l)/2;
            if(spiltK(nums,m,k)){
                ans = m;
                r=m-1;
            }else{
                l = m+1;
            }
        }
        return ans;
    }
    private boolean spiltK(int [] arr,int mid,int k){
        int cursum = 0;
        int count = 1;
        for(int i:arr){
            cursum+=i;
            if(cursum>mid){
                count++;
                if(count>k) return false;
                cursum = i;
            }
            
        }
        return true;
        
    }
}