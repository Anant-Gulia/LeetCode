class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        if (a.length() != b.length())
            return (a.length() > b.length())? a.length() : b.length();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return a.length();
        }
        return -1;
    }
}