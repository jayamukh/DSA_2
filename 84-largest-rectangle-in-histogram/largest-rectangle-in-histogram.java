class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(-1);
        int len = heights.length;
        int maxArea = 0;
        for(int i = 0; i < len; i++)
        {
            while((st.peek() != -1) && (heights[st.peek()] >= heights[i]))
            {
                int curHt = heights[st.pop()];
                int curWd = i - st.peek() - 1;
                maxArea = Math.max(maxArea, curHt * curWd);
            }
            st.push(i);
        }

        while(st.peek() != -1)
        {
             int curHt = heights[st.pop()];
             int curWd = len - st.peek() - 1;
             maxArea = Math.max(maxArea, curHt * curWd);
        }
        return maxArea;
    }
}