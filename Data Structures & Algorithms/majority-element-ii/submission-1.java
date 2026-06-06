class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        int first = 0, second = 1; // different initial values
        int count1 = 0, count2 = 0;

        // 1st pass: find candidates
        for (int num : nums) {
            if (num == first) {
                count1++;
            } else if (num == second) {
                count2++;
            } else if (count1 == 0) {
                first = num;
                count1 = 1;
            } else if (count2 == 0) {
                second = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // 2nd pass: verify counts
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == first) count1++;
            else if (num == second) count2++;
        }

        List<Integer> ans = new ArrayList<>();

        if (count1 > n / 3) ans.add(first);
        if (count2 > n / 3 && second != first) ans.add(second);

        return ans;
    }
}