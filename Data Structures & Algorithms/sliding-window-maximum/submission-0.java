class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = k-1;
        while(right<nums.length){
            ans.add(findmax(nums,left++,right++));
            
        }
        int[] ans1 = new int[ans.size()];
        for(int i = 0;i<ans.size();i++){
            ans1[i] = ans.get(i);
        }
        return ans1;
    }
    
    public int findmax(int[] arr,int left,int right){
        int max = Integer.MIN_VALUE;
        for(int i = left;i<=right;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}
