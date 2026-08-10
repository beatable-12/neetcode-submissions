class Solution {
    public int subsetXORSum(int[] nums) {
        return backtracking(nums,0,0);
    }
    private int backtracking(int[] nums,int i,int xor){
        if(i == nums.length){
            return xor;
        }
        int take = backtracking(nums,i+1,xor^nums[i]);
        int skip = backtracking(nums,i+1,xor);
        return take +skip;
    }
}