class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(1,n,k,new ArrayList<>());
        return ans;
    }
    public void backtracking(int start,int n,int k,List<Integer> temp){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start;i<=n;i++){
            temp.add(i);
            backtracking(i+1,n,k,temp);
            temp.remove(temp.size()-1);
        }
    }

}