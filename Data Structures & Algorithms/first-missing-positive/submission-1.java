class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int ans = 1;
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            if(!set.contains(ans)){
                return ans;
            }
            ans++;
        }
        return ans;
    }
}