class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) 
                current++;
            else {
                max = Math.max(max, current);
                current = 0;
            }
        }
        if (nums[nums.length - 1] == 1)
            max = Math.max(max, current);
        return max;
    }
}