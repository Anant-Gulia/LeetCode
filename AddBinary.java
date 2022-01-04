class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0; 
        while (i >= 0 || j >= 0) {
            if (i >= 0)
                carry += a.charAt(i) - '0';
            if (j >= 0)
                carry += b.charAt(j) - '0';
            answer.append((carry % 2) + "");
            carry /= 2;
            i--;
            j--;
        }
        if (carry == 1)
            answer.append(carry + "");
        return answer.reverse().toString();
    }
}