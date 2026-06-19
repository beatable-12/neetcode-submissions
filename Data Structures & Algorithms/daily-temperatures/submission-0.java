class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<nums.length;i++){
            boolean bigFound = false;
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    st.push(j-i);
                    bigFound = true;
                    break;
                }
            }
            if(!bigFound){
                st.push(0);
            }
        }

        int [] ans = new int[st.size()];
        for(int i =0;i<ans.length;i++){
            ans[i] = st.get(i);
        }
        return ans;
    }
}