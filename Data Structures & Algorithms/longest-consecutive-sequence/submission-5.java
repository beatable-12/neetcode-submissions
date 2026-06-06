class Solution {
    public int longestConsecutive(int[] nums) {
     HashSet<Integer> set = new HashSet<>();
     for(int n:nums) set.add(n);

     int longest = 0;
     for(int n :set){
        if(!set.contains(n-1)){
            int current = 0;
            while(set.contains(n+current)){
                //longest++;
                current++;
            }
            longest = Math.max(longest,current);
        }
     }   
     return longest;
    }
}
