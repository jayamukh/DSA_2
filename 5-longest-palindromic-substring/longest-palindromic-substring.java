class Solution {
    public String longestPalindrome(String s) {
        
        //generate all possible substring
    //     int maxLen = Integer.MIN_VALUE;
    //     String longestStr = "";
    //     for(int i = 0; i < s.length(); i++)
    //     {
    //         for(int j = i+1; j <= s.length(); j++)
    //         {
    //             String substr = s.substring(i,j);
    //             if(checkPalindrome(substr))
    //             {
    //                 if(substr.length() > maxLen)
    //                 {
    //                     longestStr = substr;
    //                 }
    //                 maxLen = Math.max(maxLen, substr.length());
    //             }
    //         }
    //     }

    //     return longestStr;
        
    // }

    // private boolean checkPalindrome(String s)
    // {
    //     int start =0;
    //     int end = s.length() -1;

    //     while (start < end)
    //     {
    //         if(!(s.charAt(start) == s.charAt(end)))
    //         return false;
    //         else
    //         {
    //             start++;
    //             end--;
    //         }

    //     }

    //     return true;
    // }


    int n = s.length();
    boolean[][] dp = new boolean[n][n];

    int[] ans = new int[]{0, 0};

    //for string of length 1
    for(int i=0; i < n; i++)
    {
        dp[i][i] = true;
    }

    //for string of length 2
    for(int i=0; i < n-1; i++)
    {
        if(s.charAt(i) == s.charAt(i+1))
        {
            dp[i][i+1] = true;
        ans[0] = i;
        ans[1] = i+1;
        } 
    }

    //for strings of length greater than 2
    for(int diff = 2; diff < n; diff++)
    {
        for(int i=0; i < n-diff; i++)
        {
            int j = i + diff;
            if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1])
            {
                dp[i][j] = true;
                ans[0] = i;
                ans[1] = j;
            }
        }
    }

    return s.substring(ans[0], ans[1]+1);
    }
}