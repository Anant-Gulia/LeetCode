class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap();
        List<String> answer = new ArrayList();
        int i = 0, min = Integer.MAX_VALUE, index = 0;
        for (i = 0; i < list1.length; i++)
            map.put(list1[i], i);
        for (i = 0; i < list2.length; i++) {
            index = i + map.getOrDefault(list2[i], Integer.MAX_VALUE - i);
            if (index < min) {
                answer.clear();
                answer.add(list2[i]);
                min = index;
            } else if (index == min)
                answer.add(list2[i]);
        }
        return answer.toArray(new String[answer.size()]);
    }
}