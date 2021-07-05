/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessNumberHigherOrLower extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n, mid = 0;
        while(left <= right) {
            mid = left + ((right - left) / 2);
            if(guess(mid) == 0)
                return mid;
            else if(guess(mid) == -1)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return 0;
    }
}