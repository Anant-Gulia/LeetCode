class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n == 0)
            return false;
        else if(n == 1)
            return true;
        return helper(n);
    }
    
    public boolean helper(int n) {
        boolean check = true;
        if(n != 1) {
            if(n % 2 != 0)
                return false;
            else
                check = helper(n/2);
        }
        return check;
    }
}