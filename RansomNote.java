class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length())
            return false;
        int[] array = new int[26];
        int i = 0;
        for (i = 0; i < magazine.length(); i++)
            array[magazine.charAt(i) - 'a']++;
        for (i = 0; i < ransomNote.length(); i++) {
            array[ransomNote.charAt(i) - 'a']--;
            if (array[ransomNote.charAt(i) - 'a'] == -1)
                return false;
        }
        return true;
    }
}