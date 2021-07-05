class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int i = 0;
        for(i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i])) 
                map.put(nums1[i], map.get(nums1[i]) + 1);
            else 
                map.put(nums1[i], 1);
        }
        for(i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                answer.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1); 
            }
        }
        int[] result = new int[answer.size()]; 
        i = 0;
        for(i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}