class Solution {
    public int[] twoSum(int[] nums, int target) {
        //one pass hashtable
         Map<Integer, Integer> exMap = new HashMap<>();
         for(int i=0; i < nums.length; i++)
         {
            int compliment = target - nums[i];
            if(exMap.containsKey(compliment))
                return new int[]{exMap.get(compliment),i};
            exMap.put(nums[i], i);
         }

         return new int[]{};
    }
}