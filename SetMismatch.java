class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int average = 0;
        int expected = nums.length * (nums.length + 1) / 2;
        boolean[] lookup = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            average += nums[i];
            if (lookup[nums[i] - 1] == true)
                ans[0] = nums[i];
            lookup[nums[i] - 1] = true;
        }
        ans[1] = ((expected - average)) + ans[0];
        return ans;
    }
}