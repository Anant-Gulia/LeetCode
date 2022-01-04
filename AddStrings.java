class AddStrings {
    public String addStrings(String num1, String num2) {
        if (num1.isEmpty())
            return num2;
        if (num2.isEmpty())
            return num1;
        StringBuilder answer = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while (i >= 0 && j >= 0) {
            answer.append((num1.charAt(i) - '0' + num2.charAt(j) - '0' + carry) % 10);
            carry = (num1.charAt(i) - '0' + num2.charAt(j) - '0' + carry) / 10;
            i--;
            j--;
        }
        if (i >= 0) {
            while (i >= 0) {
                answer.append((num1.charAt(i) - '0' + carry) % 10);
                carry = (num1.charAt(i) - '0' + carry) / 10;
                i--;
            }
        } else {
            while (j >= 0) {
                answer.append((num2.charAt(j) - '0' + carry) % 10);
                carry = (num2.charAt(j) - '0' + carry) / 10;
                j--;
            }
        }
        if (carry > 0)
            answer.append(carry);
        return answer.reverse().toString();
    }
}