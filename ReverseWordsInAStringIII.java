class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        StringBuilder answer = new StringBuilder();
        int check = 0, length = 0;
        for (int i = 0; i < s.length();) {
            while (check < s.length() && s.charAt(check) != ' ') 
                check++;
            check--;
            length = check;
            while (check >= i) {
                answer.append(s.charAt(check));
                check--;
            }
            i = length + 1;
            while (i < s.length() && s.charAt(i) == ' ') {
                answer.append(s.charAt(i));
                i++;
            }
            check = i;
        }
        return answer.toString();
    }
}