class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>(nums.length);
        for(int x: nums)
        {
            numSet.add(x);
        }

        int maxStreak = 0;

        for(int n : numSet)
        {
            if(!numSet.contains(n-1))
            {
                int curNum = n;
                int curStreak = 1;

                while (numSet.contains(curNum +1))
                {
                    curNum += 1;
                    curStreak +=1;
                }
                maxStreak = Math.max(maxStreak,curStreak);
            }
        }

        return maxStreak;
    }
}