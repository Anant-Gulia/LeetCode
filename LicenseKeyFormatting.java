class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder answer = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                if (count == k) {
                    answer.append('-');
                    count = 0;
                }
                answer.append(Character.toUpperCase(s.charAt(i)));
                count++;
            }
        }
        return answer.reverse().toString();
    }
}