class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        for(; i>=0; i--){
            if(s.charAt(i) != ' ')
                length++;
            else{
                if(length > 0)
                    return length;
            }
        }
        return length;
    }
}