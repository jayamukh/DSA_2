class Solution {
    public int maximumGain(String s, int x, int y) {

        int totalScore = 0;
        String highPair = x>y?"ab":"ba";
        String lowPair = highPair.equals("ab")?"ba":"ab";

        //first pass with highPair
        String strAfterFirstPass = removeSubstring(s, highPair);
        int delPairCnt = (s.length() - strAfterFirstPass.length())/2;

        int totalscore = delPairCnt * Math.max(x,y);

        //second pass with lowPair
           String strAfterSecPass = removeSubstring(strAfterFirstPass, lowPair);
           delPairCnt = 0;
        delPairCnt = (strAfterFirstPass.length() - strAfterSecPass.length())/2;

        totalscore += delPairCnt * Math.min(x,y);
        return totalscore;
    }

    private String removeSubstring(String input, String pair)
    {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < input.length(); i++)
        {
            char current = input.charAt(i);

            if(current == pair.charAt(1) && !st.isEmpty() && st.peek() == pair.charAt(0))
            {
                st.pop();

            }
            else
            {
                st.push(current);
            }
        }

        StringBuilder remainingChars = new StringBuilder();
        while(!st.isEmpty())
        {
            remainingChars.append(st.pop());   
        }

        return remainingChars.reverse().toString();
    }
}