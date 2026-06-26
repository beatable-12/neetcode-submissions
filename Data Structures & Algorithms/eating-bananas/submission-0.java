class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int n = piles.length;
     int low = 1;
     int max = 0;
     for(int a:piles) max=Math.max(max,a);
     int high = max;
     int ans = Integer.MAX_VALUE;
     while(low<=high){
        int mid = low+(high-low)/2;
        int k = countHr(piles,mid);
        if(k<=h){
            ans = mid;
            high = mid-1;
        }else{
            low=mid+1;
            
        }
     }   
     return ans;
    }
    public int countHr(int[] arr,int mid){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=(arr[i]+mid-1)/mid; 
        }
        return sum;
    }
}
