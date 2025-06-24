class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0)
        return false;
        
        int num  = x;
        int rev = 1;
       
            int lastDigit = num %10;
            num  = num/10;
            rev  = lastDigit;

            while (num != 0)
        {
            lastDigit = num %10;
            num  = num/10;
            rev  = rev *10 + lastDigit;

        }
         return x == rev;
    }
}