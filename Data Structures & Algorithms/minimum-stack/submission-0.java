class MinStack {
private Stack<Integer> st;
    public MinStack() {
        st =new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i =0;i<st.size();i++){
            min = Math.min(min,st.get(i));
        }
        return min;
    }
}
