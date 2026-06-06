class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> hm = new HashMap<>();
        for(String s :strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String word = new String(c);
            if(!hm.containsKey(word)){
                hm.put(word,new ArrayList<>());
            }
            hm.get(word).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
