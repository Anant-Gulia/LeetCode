class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList();
        if (nums.length == 0)
            return list;
        int start = nums[0], end = nums[0], i = 0;
        for (i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1] + 1) {
                end = nums[i - 1];
                if (end != start)
                    list.add(start + "->" + end);
                else
                    list.add(start+"");
                start = nums[i];
            }
        }
        end = nums[i - 1];
        if (end != start)
            list.add(start + "->" + end);
        else
            list.add(start+"");
        return list;
    }
}