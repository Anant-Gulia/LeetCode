class Maximum ProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        int high1 = Integer.MIN_VALUE, high2 = high1, low1 = Integer.MAX_VALUE, low2 = low1;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] > high1) {
                high2 = high1;
                high1 = nums[i];
            } else if(nums[i] > high2)
                high2 = nums[i];
            if(nums[i] < low1) {
                low2 = low1;
                low1 = nums[i];
            } else if(nums[i] < low2)
                low2 = nums[i];
        }
        return Math.max((high1 - 1) * (high2 - 1), (low1 - 1) * (low2 - 1));
    }
}