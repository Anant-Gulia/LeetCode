class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum_arr=0;
        for(int i=0;i<nums.length;i++)
            sum_arr+=nums[i];
        return (nums.length*(nums.length+1)/2)-sum_arr;
    }
}