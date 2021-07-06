class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(i > k)
                map.remove(nums[i - k - 1]);
            if(map.get(nums[i]) == null)
                map.put(nums[i], i);
            else if(Math.abs(map.get(nums[i]) - i) <= k)
                return true;
        }
        return false;
    }
}