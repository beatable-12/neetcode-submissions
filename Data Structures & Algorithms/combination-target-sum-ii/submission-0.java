class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(candidates,target,0,new ArrayList<>(),ans);
        return ans;

    }
    public void backtracking(int[] arr,int x,int start,List<Integer> temp,List<List<Integer>> ans){
        if(x ==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(x<0){
            return;
        }
        for(int i = start;i<arr.length;i++){
            if(i>start && arr[i] == arr[i-1]) continue;
            if(arr[i]>x) break;

            temp.add(arr[i]);
            backtracking(arr,x-arr[i],i+1,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
