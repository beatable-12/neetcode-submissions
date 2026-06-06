class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int x = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int n:hm.keySet()){
            if(hm.get(n)>(x/3)){
                ans.add(n);
            }
        }
        return ans;
    }
}