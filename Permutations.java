class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        helper(list, new ArrayList<>(), nums);
        return list;
    }
    
    public void helper(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length)
            list.add(new ArrayList<>(tempList));
        else {
            for (int i = 0 ; i < nums.length; i++) {
                if(!tempList.contains(nums[i])) {
                    tempList.add(nums[i]);
                    helper(list, tempList, nums);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }
}