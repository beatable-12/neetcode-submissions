class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int ans =0;
        for(int i =0;i<n;i++){
            int area = 0;
            for(int j =0;j<n;j++){
                area = Math.min(heights[i],heights[j])*(Math.abs(i-j));
                ans = Math.max(ans,area);
            }
        }
        return ans;
    }
}
