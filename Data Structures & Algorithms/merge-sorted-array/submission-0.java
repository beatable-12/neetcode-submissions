class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m;
        int right = 0;
        while(right<n){
            nums1[left++] = nums2[right++];
        }
        Arrays.sort(nums1);
    }
}