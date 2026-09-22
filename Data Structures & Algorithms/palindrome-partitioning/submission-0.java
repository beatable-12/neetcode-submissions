class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtracking(s,0,new ArrayList<>(),ans);
        return ans;
    }
    public void backtracking(String s,int partitior,List<String> temp,List<List<String>> ans){
        
        if(partitior == s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i =partitior;i<s.length();i++){
            String ch = s.substring(partitior,i+1);
            if(isPal(ch)){
                temp.add(ch);
                backtracking(s,i+1,temp,ans);
                temp.remove(temp.size()-1);
            }
        }
        
    }



    private boolean isPal(String s){
        int n = s.length();
        if(n == 1) return true;

        for(int i =0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}