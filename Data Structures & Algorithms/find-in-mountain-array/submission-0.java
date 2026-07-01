/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int p = peek(mountainArr);
        int n = mountainArr.length();
        int a = binarySearch(mountainArr,0,p,target,false);
        int b = binarySearch(mountainArr,p,n-1,target,true);
        if(a!=-1){
            return a;
        }
        return b;
        
    }
    private int peek(MountainArray mountainArr){
        int n = mountainArr.length();
        //if(mountainArr.get(0)>mountainArr.get(1)) return 0;
        //if(mountainArr.get(n-1)>mountainArr.get(n-1)) return n-1;
        int l = 0;
        int h = n-1;
        while(l<h){
            int m = l+(h-l)/2;
            if(mountainArr.get(m)<mountainArr.get(m+1)){
                l = m+1;
            }else{
                h = m;
            }
        }
        return l;
    }
    private int binarySearch(MountainArray mountainArr,int low,int high,int target,boolean asc){
        int n = mountainArr.length();
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mountainArr.get(mid) == target){
                return mid;
            }
            if(asc){
                if(mountainArr.get(mid)<target){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(mountainArr.get(mid)<target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}