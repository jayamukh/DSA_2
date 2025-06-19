class Solution {
    public int missingNumber(int[] nums) {
        int n  = nums.length;
        int sum = n * (n+1)/2;
        int sum_2 = 0;
        for(int i = 0; i < n ; i++)
        {
            sum_2 += nums[i];
        }

        return sum - sum_2;
    }
}