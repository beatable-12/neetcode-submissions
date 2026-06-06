class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int left = m-1;
     int right = n-1;
     int last = m+n-1;
     while(right>=0){
        if(left>=0 && nums1[left] >nums2[right]){
            nums1[last--] = nums1[left--];
        }else{
            nums1[last--] =nums2[right--];
        }
     }   
    }
}