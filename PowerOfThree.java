class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n == 0)
            return false;
        else if(n == 1)
            return true;
        return helper(n);
    }
    
    public boolean helper(int n) {
        boolean check = true;
        if(n != 1) {
            if(n % 3 != 0)
                return false;
            else
                check = helper(n/3);
        }
        return check;
    }
}