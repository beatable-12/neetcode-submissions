class Solution {
    public String decodeString(String s) {
        int n = s.length();
        Stack<String> str = new Stack<>();
        Stack<Integer> num = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int k =0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }else if(c =='['){
                str.push(curr.toString());
                num.push(k);
                curr = new StringBuilder();
                k=0;
            }else if(c==']'){
                String temp = curr.toString();
                curr = new StringBuilder(str.pop());
                int count = num.pop();
                for(int i=0;i<count;i++){
                    curr.append(temp);
                }
            }else{
                curr.append(c);
            }
        }
        return curr.toString();
    }
}