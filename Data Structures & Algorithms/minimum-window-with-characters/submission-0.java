class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m>n) return "";
        int [] map1 = new int[256];
        int map2[] = new int[256];

        int winLen = Integer.MAX_VALUE;
        int minSt = 0;
        int left= 0;
        for(char c:t.toCharArray()) map1[c]++;

        for(int right =0;right<n;right++){
            map2[s.charAt(right)]++;
            while(match(map1,map2)){
                if(winLen>right-left+1){
                    winLen = right-left+1;
                    minSt = left;
                }
                map2[s.charAt(left)]--;
                left++;
            }

        }
        return winLen == Integer.MAX_VALUE?"":s.substring(minSt,minSt+winLen);

        
    }
    private boolean match(int[] map1,int[]map2){
        for(int i =0;i<256;i++){
            if(map1[i] > map2[i]){
                return false;
            }
        }
        return true;
    }
}
