class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums,new ArrayList<>());
        return ans;
    }
    public void backtracking(int[] arr,List<Integer> temp){
        if(temp.size() == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i<arr.length;i++){
            
            if(temp.contains(arr[i])){
                 continue;
            }
            temp.add(arr[i]);
            backtracking(arr,temp);
            temp.remove(temp.size()-1);
        }
    }
}