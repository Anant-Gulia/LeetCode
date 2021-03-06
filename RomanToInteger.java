class RomanToInteger {
    public int romanToInt(String s) {
        if (s.equals(null))
            return 0;
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i=s.length()-1;i>=0;i--){
            result += map.get(s.charAt(i));
            if(i>=1){
                if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {
                    result -= map.get(s.charAt(i-1));
                    i--;
                }
            }
        }
        return result;
    }
}