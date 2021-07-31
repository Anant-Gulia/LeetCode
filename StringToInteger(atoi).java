class StringToInteger(atoi) {
    public int myAtoi(String s) {
        int sign = 1, answer = 0, i = 0;
        if (s.length() == 0)
            return answer;
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-')? -1 : 1;
            i++;
        }
        for (; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && Integer.MAX_VALUE % 10 < s.charAt(i) - '0'))
                    return (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
                else
                    answer = answer * 10 + (s.charAt(i) - '0');
            } else
                break;
        }
        return answer * sign;
    }
}