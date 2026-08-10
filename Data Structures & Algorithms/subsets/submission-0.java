class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return backtracking(nums,0,new ArrayList<>());
    }

    public List<List<Integer>> backtracking(int[] arr,int i ,List<Integer> temp){
        if(i == arr.length){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(temp));
            return ans;
        }
        temp.add(arr[i]);
        List<List<Integer>> take = backtracking(arr,i+1,temp);
        temp.remove(temp.size()-1);
        List<List<Integer>> skip = backtracking(arr,i+1,temp);
        take.addAll(skip);
        return take;
    }
}
