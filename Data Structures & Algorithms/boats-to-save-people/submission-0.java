class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        int n = nums.length;
        int count =0;
        int left = 0;
        int right =n-1;
        Arrays.sort(nums);
        while(left<=right){
            int rem = limit-nums[right--];
            count++;
            if(left<=right&&nums[left]<=rem){
                left++;
            }
            
        }
        return count;
    }
}