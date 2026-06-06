class Solution {
    public int[] twoSum(int[] numbers, int target) {
        List<Integer> ans =new ArrayList<>();
        int n = numbers.length;
        for(int i = 0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int sum = numbers[i]+numbers[j];
                if(sum == target){
                    return new int[]{i+1,j+1};
                }
            }   
        }
        return new int[]{0,0};   
    }
}   
