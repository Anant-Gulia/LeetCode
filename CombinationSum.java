class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        helper(list, new ArrayList<>(), candidates, 0, target);
        return list;
    }
    
    public void helper (List<List<Integer>> list, List<Integer> tempList, int[] candidates, int index, int target) {
        if (index == candidates.length) {
            if (target == 0)
                list.add(new ArrayList<>(tempList));
            return;
        }
        if (candidates[index] <= target) {
            tempList.add(candidates[index]);
            helper(list, tempList, candidates, index, target - candidates[index]);
            tempList.remove(tempList.size() - 1);
        }
        helper(list, tempList, candidates, index + 1, target);
    }
}