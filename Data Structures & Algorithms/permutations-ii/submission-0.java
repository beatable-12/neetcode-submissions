class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtracking(nums,new ArrayList<>(),ans,used);
        return ans;
    }
    private void backtracking(int[] arr,List<Integer> temp,List<List<Integer>> ans,boolean[] used){
        if(temp.size() == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i =0;i<arr.length;i++){
            if((i>0 && arr[i] == arr[i-1])&&used[i-1] ) continue;

            if(!used[i]){
            temp.add(arr[i]);
            used[i] = true;
            backtracking(arr,temp,ans,used);
            temp.remove(temp.size()-1);
            used[i] = false;
            }
        }
    }
}