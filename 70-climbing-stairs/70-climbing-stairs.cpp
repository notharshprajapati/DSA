class Solution {
public:
    int climbStairsMemoized(int &n, int stepsRemaining, vector<int> &dp) {
        if (stepsRemaining < 0) {
            return 0;
        }
        
        if (stepsRemaining == 0) {
            return 1;
        }
        
        if (dp[stepsRemaining] != -1) {
            return dp[stepsRemaining];
        }
        
        
        int one = climbStairsMemoized(n, stepsRemaining - 1, dp);
        int two = climbStairsMemoized(n, stepsRemaining -2, dp);
        
        return dp[stepsRemaining] = one + two;        
    }
    
    
    int climbStairs(int n) {
        vector<int> dp (n + 1, -1);
        
        return climbStairsMemoized(n, n, dp);
    }
};