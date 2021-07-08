class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] + 1))
                answer = Math.max(answer, map.get(nums[i]) + map.get(nums[i] + 1));
        }
        return answer;
    }
}