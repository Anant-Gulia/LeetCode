class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0, answer = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[answer] = nums[i];
                answer++;
            }
            i++;
        }
        return answer;
    }
}