/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        int rand = 0;
        while(l<=r)
        {   rand = ((r-l)/2)+l;
            if(guess(rand) == 0)
            {
                return rand;
            }
            else if( guess(rand) == 1)
            {
                l = rand +1;
            }
            else {
                r = rand -1;
        }
        }
        return rand;
    }
}