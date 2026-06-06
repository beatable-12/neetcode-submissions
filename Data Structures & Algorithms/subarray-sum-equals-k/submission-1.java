class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        int prefixSum = 0;
        int count = 0;
        hm.put(0,1);
        for(int i = 0;i<n;i++){
            prefixSum+=nums[i];
            int currentSum = prefixSum - k;
            if(hm.containsKey(currentSum)){
                count+=hm.get(currentSum);
            }
            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
            
        }
        return count;
    }
}