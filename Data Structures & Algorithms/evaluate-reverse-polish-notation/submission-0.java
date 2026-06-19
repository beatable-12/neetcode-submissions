class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(int i =0;i<tokens.length;i++){
            String s = tokens[i];
            if(s.equals("+")){
                 int a = stack.pop();
                 int b = stack.pop();
                 stack.push(a+b);
            }else if(s.equals("*")){
               int a = stack.pop();
                 int b = stack.pop();
                 stack.push(a*b);
            }else if(s.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                 stack.push(b/a);
            }else if(s.equals("-")){
               int a = stack.pop();
                int b = stack.pop();
                 stack.push(b-a);
            }else{
                int n = Integer.parseInt(s);
                stack.push(n);
            }
        }
        return stack.pop();
    }
}