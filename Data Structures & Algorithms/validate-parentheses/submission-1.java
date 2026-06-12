class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        HashMap<Character,Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put(']','[');
        hm.put('}','{');
        for(char c : s.toCharArray()){
            if(hm.containsKey(c)){
                if(!st.isEmpty() && st.peek() == hm.get(c)){
                    st.pop();
                }else{
                    return false;
                }
            }else{
                st.push(c);
            }
        }
        return st.isEmpty();

    }
}