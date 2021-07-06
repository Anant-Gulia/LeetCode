class HappyNumber {
    public boolean isHappy(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        while(list.add(n)) {
            while(n > 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            if(sum == 1)
                return true;
            else if (list.contains(sum))
                return false;
            else {
                n = sum;
                list.add(sum);
                sum = 0;
            }
        }
        return false;
    }
}