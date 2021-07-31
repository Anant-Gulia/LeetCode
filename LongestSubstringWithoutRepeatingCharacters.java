class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        HashSet<Character> set = new HashSet<Character>();
        int left = 0, right = 0, answer = 1, temp = 0;
        while (right < s.length() && right >= left) {
            if(set.add(s.charAt(right))) {
                temp = right - left + 1;
                answer = Math.max(answer, temp);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return answer;
    }
}