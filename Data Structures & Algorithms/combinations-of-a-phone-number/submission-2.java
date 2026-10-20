class Solution {
    List<String> ans = new ArrayList<>();
    String [] digitsphone = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return ans;
        backtracking(0,"",digits);
        return ans;
    }
    public void backtracking(int i,String curr,String digits){
        
        if(curr.length() == digits.length()){
            ans.add(curr);
            return;
        }
        String dig_char = digitsphone[digits.charAt(i) - '0'];
        for(char c : dig_char.toCharArray()){
            backtracking(i+1,curr+c,digits);
        }
    }
}