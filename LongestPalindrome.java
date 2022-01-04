class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] array = new int[70];
        int answer = 0, i = 0;
        boolean unique = false;
        for (i = 0; i < s.length(); i++)
            array[s.charAt(i) - 'A']++;
        i = 0;
        while (i < array.length) {
            if (array[i] > 1) {
                answer += 2;
                array[i] -= 2;
            } else if (unique == false && array[i] >= 1) {
                answer++;
                unique = true;
            } else
                i++;
        }
        return answer;
    }
}