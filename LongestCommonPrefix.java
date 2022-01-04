class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();
        char letter;
        for (int i = 0; i < strs[0].length(); i++) {
            letter = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i < strs[j].length()) {
                    if (strs[j].charAt(i) != letter) {
                        return answer.toString();
                    }
                } else
                    return answer.toString();
            }
            answer.append(letter);
        }
        return answer.toString();
    }
}