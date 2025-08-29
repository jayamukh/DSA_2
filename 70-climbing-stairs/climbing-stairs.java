class Solution {
    public int climbStairs(int n) {
        int memo[] = new int[n+1];
        return climbStairs_rec(0, n, memo);
    }

public int climbStairs_rec(int i, int n, int[] memo)
{
    if(i>n)
    {
        return 0;
    }
    if(i == n)
    {
        return 1;
    }
    if(memo[i] > 0)
    {
        return memo[i];
    }
    memo[i] = climbStairs_rec(i+1,n, memo) + climbStairs_rec(i+2,n, memo);
return memo[i] ;
}
        
    }
