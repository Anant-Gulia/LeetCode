class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        char[] array = new char[2 * n];
        combinations(array, 0, list);
        return list;
    }
    
    private void combinations (char[] array, int position, List<String> list) {
        if (position == array.length) {
            if (check(array))
                list.add(new String(array));
        } else {
            array[position] = '(';
            combinations(array, position + 1, list);
            array[position] = ')';
            combinations(array, position + 1, list);
        }
    }
    
    private boolean check (char[] array) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(')
                stack.push('(');
            else {
                if (stack.isEmpty() || stack.pop() != '(') 
                    return false;
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }
}