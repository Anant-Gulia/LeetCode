class 3SumClosest {    
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int answer = Integer.MAX_VALUE, left = 0, right = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            left = i + 1;
            right = nums.length - 1;
            while(left < right) {
                if (Math.abs(target - nums[i] - nums[left] - nums[right]) < Math.abs(answer))
                    answer = target - nums[i] - nums[left] - nums[right];
                if (target - nums[i] - nums[left] - nums[right] == 0)
                    break;
                    
                if (nums[i] + nums[left] + nums[right] < target)
                    left++;
                else 
                    right--;
            }
        }
        return target - answer;
    }
}