class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 1, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            }else {
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        return Math.max(ans, count);
    }
}