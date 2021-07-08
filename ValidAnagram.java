class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] counter = new int[26];
        int i = 0;
        for(i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for(i = 0; i < counter.length; i++) {
            if(counter[i] != 0) 
                return false;
        }
        return true;
    }
}


/* Generic

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            else
                map.put(s.charAt(i), 1);
        }
        for(int i = 0; i < t.length(); i++) {
            if(map.containsKey(t.charAt(i))) {
                if(map.get(t.charAt(i)) > 0)
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                else 
                    return false;
            } else
                return false;
        }
        return true;
    }
}
*/