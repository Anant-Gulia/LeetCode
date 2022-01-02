class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int answer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[answer]) {
                answer++;
                nums[answer] = nums[i];
            }
        }
        answer++;
        return answer;
    }
}