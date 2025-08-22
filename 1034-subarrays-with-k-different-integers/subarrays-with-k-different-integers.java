class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarraysWithAtMostKDistinct(nums, k) - subarraysWithAtMostKDistinct(nums, k-1);
    }

    public static int subarraysWithAtMostKDistinct(int[] nums, int k)
    {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        for(int right=0;  right< nums.length; right++)
        {
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);

            while(map.size() > k)
            {
                map.put(nums[left], map.getOrDefault(nums[left],0)-1);
                if(map.get(nums[left]) == 0)
                {
                    map.remove(nums[left]);
                }
                left++;

            }
            count += right-left+1;
        }


        return count;
    }
}