class Solution {
    public int lengthOfLongestSubstring(String s) {
/* Brute Force
        int len = s.length();
        int res = 0;
        for(int i=0; i < len; i++)
        {
            for(int j=i; j < len; j++)
            {
                if(check(i, j, s))
                {
                    res = Math.max(res, j-i+1);
                }
            }
        }

        return res;
        */
       //Sliding window

      Integer[] chars = new Integer[128];

       int left = 0;
       int right = 0;

       int res = 0;

      /* while(right < s.length())
       {
            char r = s.charAt(right);
            chars.put(r, chars.getOrDefault(r,0)+1);

            while(chars.get(r) > 1)
            {
                char l = s.charAt(left);
                chars.put(l, chars.get(l) - 1);
                left ++;
            }

            res = Math.max(res, right - left +1);
            right++;
            
       }*/

       while (right < s.length())
       {
            char r = s.charAt(right);
            Integer idx = chars[r];
            if(idx != null && idx >= left && idx< right)
            {
                left = idx+1;
            }
            res = Math.max(res, right - left+1);
            chars[r] = right;
            right++;

       }
       return res; 
    }
/* Brute Force
    boolean check(int start, int end, String s)
    {
        int[] arr = new int[128];

        for(int i=start; i <= end; i++)
        {
            char c = s.charAt(i);
            arr[c]++;
            if(arr[c] > 1)
            return false;
        }

        return true;
    } */

}