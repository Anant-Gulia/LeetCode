class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = 0, first = -1, last = -1, leftTemp = 0, rightTemp = 0, midTemp = 0;
        int[] answer = new int[2];
        while(left <= right) {
            mid = left + ((right - left) / 2);
            if(nums[mid] == target) {
                first = mid;
                last = mid;
                leftTemp = left;
                rightTemp = right;
                midTemp = mid;
                break;
            } else if(nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        if(first != -1 && last != -1) {
            right = mid - 1;
            while(left <= right) {
                mid = left + ((right - left) / 2);
                if((nums[mid] == target) && (((mid - 1 >= 0) && (nums[mid - 1] != target)) || mid == 0)) {
                    first = mid;
                    break;
                } else if(nums[mid] != target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            left = leftTemp;
            right = rightTemp;
            mid = midTemp;
            left = mid + 1;
            while(left <= right) {
                mid = left + ((right - left) / 2);
                if((nums[mid] == target) && (((mid + 1 <= nums.length - 1) && (nums[mid + 1] != target) ) || mid == nums.length - 1))  {
                    last = mid;
                    break;
                } else if(nums[mid] != target)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        answer[0] = first;
        answer[1] = last;
        return answer;
    }
}