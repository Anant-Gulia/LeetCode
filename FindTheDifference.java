class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] table = new int[26];
        int i = 0;
        for(i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
            table[t.charAt(i) - 'a']--;
        }
        for(i = 0; i < table.length; i++) {
            if(table[i] < 0)
                return (char) (i + 'a');
        }
        return t.charAt(t.length() - 1);
    }
}