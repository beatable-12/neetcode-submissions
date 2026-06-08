class Solution {
    public int characterReplacement(String s, int k) {
        int n =s.length();
        int left =0;
        //int right = n-1;
        int maxwindow = 0;
        int maxfreq = 0;
        int [] freq = new int[26];
        for(int r = 0;r<n;r++){
            freq[s.charAt(r) -'A']++;
            maxfreq = Math.max(maxfreq,freq[s.charAt(r)-'A']);

            int wlen = r-left+1;
            if(wlen-maxfreq>k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            wlen = r-left+1;
            maxwindow = Math.max(maxwindow,wlen);
        }
        return maxwindow;
    }
}
