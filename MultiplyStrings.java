class MultiplyStrings {
    public String multiply(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0, j = 0, carry = 0;
        int[] answer = new int[num1.length() + num2.length()];
        for (i = num1.length() - 1; i >= 0; i--) {
            for (j = num2.length() - 1; j >= 0; j--)
                answer[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        }
        for (i = answer.length - 1; i >= 0; i--) {
            answer[i] += carry;
            carry = answer[i] / 10;
            answer[i] %= 10;
        }
        i = (answer[0] == 0)? 1 : 0;
        for (; i < answer.length; i++) 
            stringBuilder.append(answer[i]);
        while (stringBuilder.length() > 0 && stringBuilder.charAt(0) == '0')
            stringBuilder.deleteCharAt(0);
        return (stringBuilder.length() == 0)? "0" : stringBuilder.toString();
    }
}