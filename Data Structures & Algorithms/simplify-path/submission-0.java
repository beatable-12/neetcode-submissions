class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] ans = path.split("/");

        for(String curr:ans){
            if(curr.equals("..")){
                if(!st.isEmpty()) st.pop();
            }else if(!curr.equals("")&&!curr.equals(".")){
                st.push(curr);
            }
        }
        return "/"+String.join("/",st);
    }
}