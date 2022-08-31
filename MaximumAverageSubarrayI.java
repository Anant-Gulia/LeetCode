class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        long ans = 0, temp = 0;
        for (int i = 0; i < k; i++)
            temp += nums[i];
        ans = temp;
        for (int i = 1, j = k; j < nums.length; i++, j++) {
            temp = temp - nums[i-1] + nums[j];
            ans = Math.max(ans, temp);
        }
        return ans / 1.0 / k;
    }
}