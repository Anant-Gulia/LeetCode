class ArrangingCoins {
    public int arrangeCoins(int n) {
        long left = 1, right = n, mid = 0, answer = 0;
        while(left <= right) {
            mid = left + ((right - left) / 2);
            if((mid * (mid + 1)) / 2 == n)
                return (int)mid;
            else if((mid * (mid + 1)) / 2 < n) {
                answer = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return (int)answer;
    }
}