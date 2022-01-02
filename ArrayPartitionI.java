class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0, i = 0;
        while (i < nums.length - 1) {
            sum += Math.min(nums[i], nums[i + 1]);
            i += 2;
        }
        return sum;
    }
}