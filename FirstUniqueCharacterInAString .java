class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int index = s.length();
        for(char i = 'a'; i <= 'z'; i++){
            if(s.indexOf(i) != -1 && s.indexOf(i) == s.lastIndexOf(i))
                index = Math.min(index,s.indexOf(i));
        }
        if(index == s.length())
            return -1;
        else 
            return index;
    }
}