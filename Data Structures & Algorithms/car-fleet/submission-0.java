class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double>st = new Stack<>();
        int n = speed.length;
        int[][] arr =new int[n][2];

        for(int i =0;i<n;i++){
            arr[i] = new int[]{position[i],speed[i]};
        }
        Arrays.sort(arr,(a,b)->b[0]-a[0]);
        for(int i =0;i<n;i++){
            double time = (double)(target-arr[i][0])/arr[i][1];
            if(!st.isEmpty()&&st.peek()>=time) continue;

            st.push(time);
        }
        return st.size();
    }
}