class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        int ans[];
        for(int i :nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> ls = new ArrayList<>(hm.entrySet());

        ls.sort((a,b) -> b.getValue() - a.getValue());

        ans = new int[k];
        for(int i =0;i<k;i++){
            ans[i] = ls.get(i).getKey();
        }
        return ans;
        
    }
}
