class ReverseVowelsOfAString{
    public String reverseVowels(String s) {
        if (s.length() == 0) return s;
        int start = 0, end = s.length() -1;
        StringBuilder stringBuilder = new StringBuilder(s);
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('a',0);
        map.put('e',1);
        map.put('i',2);
        map.put('o',3);
        map.put('u',4);
        while(start < end){
            if(!map.containsKey(Character.toLowerCase(s.charAt(start))) && !map.containsKey(Character.toLowerCase(s.charAt(end)))){
                start++;
                end--;
            }
            else if(!map.containsKey(Character.toLowerCase(s.charAt(start)))) {
                stringBuilder.setCharAt(start,s.charAt(start));
                start++;
            } else if(!map.containsKey(Character.toLowerCase(s.charAt(end)))) {
                stringBuilder.setCharAt(end, s.charAt(end));
                end--;
            } else{
                stringBuilder.setCharAt(end,s.charAt(start));
                stringBuilder.setCharAt(start,s.charAt(end));
                start++;
                end--;
            }
        }
        return stringBuilder.toString();
    }
}