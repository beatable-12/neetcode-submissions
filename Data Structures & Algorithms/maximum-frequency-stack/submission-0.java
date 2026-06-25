class FreqStack {
private Map<Integer,Integer> cnt;
private Map<Integer,Stack<Integer>> stack;
private int maxcnt=0;
    public FreqStack() {
        cnt = new HashMap<>();
        stack = new HashMap<>();
        maxcnt = 0;
    }
    
    public void push(int val) {
        int valcnt = cnt.getOrDefault(val,0)+1;
        cnt.put(val,valcnt);
        if(valcnt>maxcnt){
            maxcnt = valcnt;
            stack.putIfAbsent(valcnt,new Stack<>());
        }
        stack.get(valcnt).push(val);
    }
    
    public int pop() {
        int res = stack.get(maxcnt).pop();
        cnt.put(res,cnt.get(res)-1);
        if(stack.get(maxcnt).isEmpty()){
            maxcnt--;
        }
        return res;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */