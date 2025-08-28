class Solution {
    public int[][] sortMatrix(int[][] grid) {
        
        int rows = grid.length;
        int cols = grid[0].length;

        int diagCount = rows + cols -1;
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < diagCount; i++)
        {
            //finding start and end of a diag
            int row = i < rows ? rows-i-1:0;
            int col =  i < rows ? 0: i - rows +1;

             arr.clear();
            
            while(row < rows && col < cols)
            {
                arr.add(grid[row][col]);
                row++;
                col++;
            }
            //System.out.println(arr);

            if(i < rows)
            {
                Collections.sort(arr, Collections.reverseOrder());
            }
            else
            {
                Collections.sort(arr);
            }
            


            //System.out.println(arr);
            row = i < rows ? rows-i-1:0;
            col =  i < rows ? 0: i - rows +1;  
            int count= 0;
            
            //System.out.println(row);
             // System.out.println(col);
            while(row < rows && col < cols)
            {
                grid[row][col] = arr.get(count);
                row++;
                col++;
                count++;
            }
           

        }
        return grid;
    }
}