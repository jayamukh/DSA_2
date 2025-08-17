class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        //hashmap approach
        List<Integer> res = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < nums1.length; i++)
        {
                map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
        }

        for(int j=0; j < nums2.length; j++)
        {
            if(map.containsKey(nums2[j]))
            {
                res.add(nums2[j]);
                int num = map.get(nums2[j]);
                if(num >1)
                {
                    map.put(nums2[j], num -1);
                }
                else
                {
                    map.remove(nums2[j]);
                }
            }
        }

        return res.stream()
        .mapToInt(Integer::intValue) // maps Integer objects to primitive int values
                                  .toArray();
        
    }
}