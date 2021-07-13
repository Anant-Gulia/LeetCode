class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n < 1)
            return false;
        else if(n == 1)
            return true;
        return helper(n);
    }
    
    public boolean helper(int n) {
        boolean check = true;
        if(n != 1) {
            if(n % 4 != 0)
                return false;
            else
                check = helper(n/4);
        }
        return check;
    }
}