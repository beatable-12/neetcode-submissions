class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n =weights.length;
        int high = 0;
        for(int a:weights) high+=a;
        int low=0;
        for(int a:weights) low = Math.max(low,a);
        int ans = 0;
        while(low<=high){
            int mid =low+(high-low)/2;
            int cnt = cntDays(weights,mid);
            if(cnt<=days){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public int cntDays(int [] arr , int mid){
        int count =1;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                count++;
                sum = arr[i];
            }else{
                sum+=arr[i];
            }
        }
        return count;
    }
}