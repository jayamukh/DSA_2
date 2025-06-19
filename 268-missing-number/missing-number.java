class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int[] newArr = new int[nums.length +1];
        Arrays.fill(newArr, -1);
        for(int idx = 0; idx < nums.length; idx++)
        {
            newArr[nums[idx]] = nums[idx];
        }
        
        for(int i = 0; i < nums.length +1; i++)
        {
            if(newArr[i] == -1)
            return i;
        }

        return -1;
    }
}