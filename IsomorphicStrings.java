class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map= new HashMap<Character,Character>();
        Set<Character> set= new HashSet<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            } else {
                map.put(s.charAt(i),t.charAt(i));
                if(set.contains(t.charAt(i)))
                    return false;
                else
                    set.add(t.charAt(i));
            }
        }
        return true;
    }
}

