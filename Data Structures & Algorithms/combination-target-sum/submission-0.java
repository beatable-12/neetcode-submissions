class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(nums,target,0,new ArrayList<>(),ans);
        return ans;
    }
    public void backtracking(int [] arr,int x,int i,List<Integer> temp,List<List<Integer>> ans){
        if( x == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(x<0 || i == arr.length){
            return;
        }
        temp.add(arr[i]);
        backtracking(arr,x-arr[i],i,temp,ans);
        temp.remove(temp.size()-1);
        backtracking(arr,x,i+1,temp,ans);
    }
}
