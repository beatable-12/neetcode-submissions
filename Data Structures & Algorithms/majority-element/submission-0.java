class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        int n1 = nums.length;
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int num:hm.keySet()){
            if(hm.get(num)>n1/2){
                return num;
            }
        }
        return 0;
    }
}