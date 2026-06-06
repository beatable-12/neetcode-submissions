class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;
        while(left<n1 && right<n2){
            sb.append(word1.charAt(left));
            sb.append(word2.charAt(right));
            left++;
            right++;
        }
        while(left<n1){
            sb.append(word1.charAt(left));
            left++;
        }
        while(right<n2){
            sb.append(word2.charAt(right));
            right++;
        }
        return sb.toString();
    }
}