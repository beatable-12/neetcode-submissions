class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Distance> pq = new PriorityQueue<>((a,b)->b.dist-a.dist);
        int n = points.length;
        int  m  = points[0].length;
        
        for(int i = 0;i<n;i++){
            int x = points[i][0];
            int y = points[i][1];
            int d = x*x+y*y;
            if(pq.size()<k){
                pq.offer(new Distance(d,new int[]{x,y}));
            }else if(pq.peek().dist>d){
                pq.poll();
                pq.offer(new Distance(d,new int[]{x,y}));
            }
        }
        int[][] ans = new int[k][2];
        for(int i = 0;i<k;i++){
            Distance curr = pq.poll();
            ans[i][0] = curr.coord[0];
            ans[i][1] = curr.coord[1];
        }
        return ans;
    }
}
public class Distance{
    int dist;
    int[] coord;
    Distance(int dist,int[] coord){
        this.dist = dist;
        this.coord = coord;
    }
}