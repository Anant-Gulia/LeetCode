class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList();
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0)
                nums[Math.abs(nums[i]) - 1] *= -1;
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] >= 0)
                list.add(i + 1);
        }
        return list;
    }
}