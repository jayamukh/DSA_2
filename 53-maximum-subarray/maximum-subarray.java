class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
    //     int max = Integer.MIN_VALUE;
    //     for (int start = 0; start < n; start++) {
    //         int sum  = 0;
    //         for (int end = start; end < n; end++) {
    //             // Print elements from index 'start' to 'end'
              
    //             sum += nums[end];
    //             max = Math.max(max, sum);
    //         }
    //     }
    // return max;

    int currentSubarray = nums[0];
    int maxSubarray = nums[0];

for(int i=1; i < n; i++)
{
    currentSubarray = Math.max(nums[i], currentSubarray + nums[i]);
    maxSubarray = Math.max(maxSubarray, currentSubarray);
}
return maxSubarray;
    

    }

}