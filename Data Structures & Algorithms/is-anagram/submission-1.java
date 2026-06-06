class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> hm1 = new HashMap<>();
        Map<Character,Integer> hm2 = new HashMap<>();
        for(char c1:s.toCharArray()) hm1.put(c1,hm1.getOrDefault(c1,0)+1);
        for(char c2:t.toCharArray()) hm2.put(c2,hm2.getOrDefault(c2,0)+1);
        
        return hm1.equals(hm2);
    }
}
