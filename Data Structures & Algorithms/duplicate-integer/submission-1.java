class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int n :hm.keySet()){
            if(hm.get(n)>1) return true;
        }
        return false;
    }
}