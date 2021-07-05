class Sqrt(x) {
    public int mySqrt(int x) {
        if(x == 0 || x == 1)
            return x;
        int left = 1, right = x - 1, mid = 0, answer = 0;
        while(left <= right) {
            mid = left + ((right - left) / 2);
            if(mid * mid == x) {
                return mid;
            } else if(mid > x / mid) {
                right = mid - 1;
            } else {
                answer = mid;
                left = mid + 1;
            }
        }
        return answer;
    }
}