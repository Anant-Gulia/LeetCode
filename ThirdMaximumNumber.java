class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE, thirdHighest = Integer.MIN_VALUE;
        boolean minExists = false;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == Integer.MIN_VALUE)
                minExists = true;
            if(nums[i] > highest) {
                thirdHighest = secondHighest;
                secondHighest = highest;
                highest = nums[i];
            } else if(nums[i] < highest && nums[i] > secondHighest) {
                thirdHighest = secondHighest;
                secondHighest = nums[i];
            } else if(nums[i] < secondHighest && nums[i] > thirdHighest) {
                thirdHighest = nums[i];
            }
        }
        if((!minExists && thirdHighest == Integer.MIN_VALUE) || secondHighest == thirdHighest)
            return highest;
        else
            return thirdHighest;
    }
}

/* Generic

class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int flag = 0, temp = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] != temp) {
                flag++;
                temp = nums[i];
            }
            if(flag == 2)
                return temp;
        }
        return nums[nums.length - 1];
    }
}
*/