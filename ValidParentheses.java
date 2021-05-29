class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('(',')'); 
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<Character>();
        if(!map.containsKey(s.charAt(0))) 
           return false;
        for(int start = 0; start < s.length(); start++){
            if(map.containsKey(s.charAt(start)))
                stack.push(s.charAt(start));
            else{
                if(stack.isEmpty())
                    return false;
                else if(map.get(stack.pop()) != s.charAt(start))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}