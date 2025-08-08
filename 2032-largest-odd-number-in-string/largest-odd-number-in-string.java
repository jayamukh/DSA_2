class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        String res = "";
        StringBuilder sb = new StringBuilder();
        int max = -1;
        for(int i=0; i < len; i++)
        {
            char digitChar = num.charAt(i);
             int parsedInt = digitChar - '0';
            if(parsedInt % 2 != 0)
            {
                max = Math.max(max, i);
            }
        }

        if(max != -1)
        {
            res = num.substring(0, max+1);
        }

        return res;

    }
}