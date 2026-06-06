class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int ans =0;
        int left = 0;
        int right = n-1;
        while(left<right){
            
            int area = Math.min(heights[left],heights[right]) *(right-left);
            ans = Math.max(ans,area);
            if(heights[left]>heights[right]){
                right--;
            }else{
                left++;
            }
            
        }
        return ans;
    }
}
