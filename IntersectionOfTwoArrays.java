class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> setAnswer = new HashSet<Integer>();
        int i = 0, flag = 0;
        for(i = 0; i < nums1.length;  i++)
            set.add(nums1[i]);
        for(i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i]))
                setAnswer.add(nums2[i]);
        }
        int[] result = new int[setAnswer.size()];
        i = 0;
        for(int num : setAnswer) {
            result[i] = num;
            i++;
        }
        return result;
    }  
}