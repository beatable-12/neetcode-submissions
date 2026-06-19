class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<arr.length;i++){
            boolean isDone = true;
            while(isDone&&!stack.isEmpty()&&stack.peek()>0&& arr[i]<0){
                if(stack.peek()<-arr[i]){
                    stack.pop();
                }else if(stack.peek() == -arr[i]){
                    stack.pop();
                    isDone = false;
                }else{
                    isDone = false;
                }
            }
            if(isDone){
                stack.push(arr[i]);
            }
            
        }
        int [] ans = new int[stack.size()];
        for(int i =0;i<stack.size();i++){
            ans[i] = stack.get(i);
        }
        return ans;
    }
}