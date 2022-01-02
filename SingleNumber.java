class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet set = new HashSet();
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i]) == true)
                temp += nums[i];
            else
                temp -= nums[i];
        }
        return temp;
    }
}