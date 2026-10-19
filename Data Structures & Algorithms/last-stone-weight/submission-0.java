class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = stones.length;
        for(int i = 0;i<n;i++){
            pq.offer(stones[i]);
        }

        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            if(a == b){
                continue;
            }else{
                pq.offer(a-b);
            }
        }
        return (pq.isEmpty())? 0:pq.peek();
    }
}