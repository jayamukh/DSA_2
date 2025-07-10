class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            else
                map.put(nums[i], 1);
        }
          for (Map.Entry<Integer, Integer> entry : map.entrySet())
          {
            if (entry.getValue() > 1)
            return true;
          }
        return false;*/

        Set<Integer> set = new HashSet<>(nums.length);
        for(int x: nums){
            if(set.contains(x)) return true;
            set.add(x);
        }

        return false;
    }
}