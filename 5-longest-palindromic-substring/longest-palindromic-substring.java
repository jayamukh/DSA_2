class Solution {
    public String longestPalindrome(String s) {
        
        //generate all possible substring
        int maxLen = Integer.MIN_VALUE;
        String longestStr = "";
        for(int i = 0; i < s.length(); i++)
        {
            for(int j = i+1; j <= s.length(); j++)
            {
                String substr = s.substring(i,j);
                if(checkPalindrome(substr))
                {
                    if(substr.length() > maxLen)
                    {
                        longestStr = substr;
                    }
                    maxLen = Math.max(maxLen, substr.length());
                }
            }
        }

        return longestStr;
        
    }

    private boolean checkPalindrome(String s)
    {
        int start =0;
        int end = s.length() -1;

        while (start < end)
        {
            if(!(s.charAt(start) == s.charAt(end)))
            return false;
            else
            {
                start++;
                end--;
            }

        }

        return true;
    }
}