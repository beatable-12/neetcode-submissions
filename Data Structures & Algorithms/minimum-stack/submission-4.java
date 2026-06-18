class MinStack {
private Stack<Integer> stack;
private Stack<Integer> minStack;
//int min = Integer.MAX_VALUE;
    public MinStack() {
        stack =new Stack<>();
        minStack =new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else {
            minStack.push(Math.min(val,minStack.peek()));
        }
        
    }
    
    public void pop() {
        int r = stack.pop();
        minStack.pop();
        
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        
        return minStack.peek();


    }
}
