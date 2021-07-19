class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        helper(list, new ArrayList<>(), 0, nums);
        return list;
    }
    
    private void helper (List<List<Integer>> list, List<Integer> tempList, int index, int[] nums) {
        list.add(new ArrayList<>(tempList));
        for (int i = index; i < nums.length; i++) {
            tempList.add(nums[i]);
            helper(list, tempList, i + 1, nums);
            tempList.remove(tempList.size() - 1);
        }
    }
}