class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0 )
                break;
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                right = nums.length - 1;
                left = i + 1;
                while (left < right) {
                    if (nums[i] + nums[left] + nums[right] == 0) {
                        list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (right > left && nums[right] == nums[right - 1])
                            right--;
                        left++;
                        right--;
                    } else if (nums[i] + nums[left] + nums[right] < 0)
                        left++;
                    else
                        right--;
                }
            }
        }
        return list;
    }
}