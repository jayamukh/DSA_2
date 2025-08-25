class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        if(mat == null || mat.length == 0)
        {
            return new int[0];
        }

        int N  = mat.length; //rows
        int M  = mat[0].length; //columns

        int[] res = new int[N * M];
        int k = 0;
        List<Integer> arr = new ArrayList<Integer>();

        for(int d= 0; d < N + M -1; d++)
        {
            arr.clear();

            int r = d < M ? 0: d-M +1;
            int c = d<M ? d : M-1;

            while(r < N && c > -1)
            {
                arr.add(mat[r][c]);
                r++;
                c--;
            }

            if(d%2 == 0)
            {
                Collections.reverse(arr);
            }

            for(int i=0; i < arr.size(); i++)
            {
                res[k++] = arr.get(i);
            }
        }

        return res;
    }
}