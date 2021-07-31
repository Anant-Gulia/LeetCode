class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> tempList = new ArrayList<String>();
        int i = 0, j = 0;
        for (i = 0; i < strs.length; i++) {
            tempList.clear();
            stringBuilder.setLength(0);
            int[] count = new int[26];
            for (j = 0; j < strs[i].length(); j++)
                count[strs[i].charAt(j) - 'a']++;
            for (j = 0; j < 26; j++) {
                stringBuilder.append(count[j]);
                stringBuilder.append('#');
            }
            if (!map.containsKey(stringBuilder.toString()))
                map.put(stringBuilder.toString(), new ArrayList<>());
            map.get(stringBuilder.toString()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}