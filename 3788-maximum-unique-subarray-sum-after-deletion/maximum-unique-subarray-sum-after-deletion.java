class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> positiveNums = new HashSet<>();
        for (int num : nums)
        {
            if(num > 0)
            {
                positiveNums.add(num);
            }
        }
        
        if(positiveNums.isEmpty())
        {
            return Arrays.stream(nums).max().getAsInt();
        }

        return positiveNums.stream().mapToInt(Integer::intValue).sum();
    }
}