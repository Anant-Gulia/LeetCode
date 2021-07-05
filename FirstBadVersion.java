/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0, right = n, mid = 0, answer = 0;
        while(left <= right) {
            mid = left + ((right - left) / 2);
            if(isBadVersion(mid)) {
                answer = mid;
                right = mid - 1;
            } else 
                left = mid + 1;
        }
        return answer;
    }
}