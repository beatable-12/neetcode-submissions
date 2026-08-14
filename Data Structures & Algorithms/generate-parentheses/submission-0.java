class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtracking(2*n,0,0,"",ans);
        return ans;
    }
    public void backtracking(int n, int left,int right,String curr,List<String> ans){
        if(left+right == n){
            ans.add(curr);
            return;
        }
        
            if(n/2>left){
                backtracking(n,left+1,right,curr+"(",ans);
            }
            if(right<left){
                 backtracking(n,left,right+1,curr+")",ans);
            }
        
    }
}
