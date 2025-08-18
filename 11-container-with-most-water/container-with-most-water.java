class Solution {
    public int maxArea(int[] height) {
        // Brute force O(n^2)
        /*int maxArea = 0;
        for(int i=0; i < height.length; i++)
        {
            for(int j=i+1; j < height.length; j++)
            {
                int curArea = Math.min(height[i], height[j]) * (j-i);
                maxArea = Math.max(curArea, maxArea);
            }
        }

        return maxArea;*/

        int max = 0;
        int start = 0, end = height.length-1;
        while(start< end)
        {
            int ht = 0, curArea = 0;
            if(height[start] >= height[end])
            {
                ht = height[end];
                curArea = ht *(end-start);
                end--;
            }
            else
            {
                ht = height[start];
                curArea = ht *(end-start);
                start++;
            }

            max = Math.max(curArea, max);

        }

        return max;
    }
}