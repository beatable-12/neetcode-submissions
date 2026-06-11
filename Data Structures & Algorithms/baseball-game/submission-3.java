class Solution {
    public int calPoints(String[] s) {
        int ans= 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<s.length;i++){
            if(s[i].equals("+")){
                int a = st.get(st.size()-2);
                int b = st.get(st.size()-1);
                st.push(a+b);
            }else if(s[i].equals("D")){
                int doub = st.peek();
                st.push(doub*2); 
            }else if(s[i].equals("C")){
                st.pop();
            }else{
                int n = Integer.parseInt(s[i]);
                st.push(n);
            }
        }
        for(int i:st){
            ans+=i;
        }
        return ans;
    }
}