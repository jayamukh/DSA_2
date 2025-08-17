class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        //hashmap approach
        /*List<Integer> res = new ArrayList<>();

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
                                  .toArray();*/

         if(nums1.length > nums2.length)
         {
            return intersect(nums2, nums1);
         }  

         HashMap<Integer, Integer> map = new HashMap<>();

         for(int n : nums1)
         {
            map.put(n, map.getOrDefault(n, 0) +  1);
         }

         int k=0;
         for(int n:nums2)
         {
            int cnt = map.getOrDefault(n,0);
            if(cnt> 0)
            {
                nums1[k++] = n;
                map.put(n, cnt - 1);

            }

         }

         return Arrays.copyOfRange(nums1,0,k);                       
        
    }
}