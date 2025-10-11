public class day85 {
    /** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

// Stub for GuessGame to resolve the type error
class GuessGame {
    // For demonstration, assume the picked number is 42
    private int picked = 42;
    public int guess(int num) {
        if (num > picked) return -1;
        else if (num < picked) return 1;
        else return 0;
    }
}

public class Solution extends GuessGame {
    public int guessNumber(int n) {


      int low=1, high=n ;
      while(low<= high){
        int mid= low+ (high-low)/2;
        if(guess(mid)== -1) high= mid-1; // Picked number is smaller than mid

        else if(guess(mid)== 1) low= mid+1;  // Picked number is larger than mid

        else return mid; // Found the picked number

      } 
      return n; // This line should normally never be reached

    }
}
}
