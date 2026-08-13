class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtracking(nums,0,new ArrayList<>());
        return ans;
    }
    public void backtracking(int[] arr , int start,List<Integer> temp){
        
            ans.add(new ArrayList<>(temp));
           
        for(int i = start;i<arr.length;i++){
            if(i>start && arr[i] == arr[i-1]) continue;

            temp.add(arr[i]);
            backtracking(arr,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}