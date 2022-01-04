class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        int j = 0;
        for (int i = 0; i < pattern.length(); i++) {
            while(j < s.length() && s.charAt(j) != ' ') {
                stringBuilder.append(s.charAt(j));
                j++;
            }
            if (j > s.length())
                return false;
            j++;
            if (map.containsKey(pattern.charAt(i))) {
                if (!stringBuilder.toString().equals(map.get(pattern.charAt(i))))
                    return false;
            } else {
                if (map.containsValue(stringBuilder.toString()))
                    return false;
                else
                    map.put(pattern.charAt(i), stringBuilder.toString());
            }
            stringBuilder.setLength(0);
        }
        if (j < s.length())
            return false;
        return true;
    }
}