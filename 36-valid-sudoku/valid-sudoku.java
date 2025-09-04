class Solution {
    public boolean isValidSudoku(char[][] board) {

     int N = 9;

//      HashSet<Character>[] rows = new HashSet[N];  
//      HashSet<Character>[] cols = new HashSet[N];
//      HashSet<Character>[] boxes = new HashSet[N];
//  for (int r = 0; r < N; r++) {
//             rows[r] = new HashSet<Character>();
//             cols[r] = new HashSet<Character>();
//             boxes[r] = new HashSet<Character>();
//         }
//     for(int r =0; r < N; r++)
//     {
//         for(int c =0; c < N; c++)
//         {
//             char val = board[r][c];

//             if(val != '.')
//             {
//                 if (rows[r].contains(val)) {
//                     return false;
//                 }
//                 rows[r].add(val);

//                 // Check the column
//                 if (cols[c].contains(val)) {
//                     return false;
//                 }
//                 cols[c].add(val);

//                 // Check the box
//                 int idx = (r / 3) * 3 + c / 3;
//                 if (boxes[idx].contains(val)) {
//                     return false;
//                 }
//                 boxes[idx].add(val);

//             }
//         }
//     }

//     return true;

int[][] rows = new int[N][N];
int[][] cols = new int[N][N];
int[][] boxes = new int[N][N];

for(int r =0; r < N; r++)
    {
        for(int c =0; c < N; c++)
        {
            int pos = board[r][c] - '1';

            if(board[r][c] != '.')
            {
                if (rows[r][pos]== 1) {
                    return false;
                }
               rows[r][pos] = 1;

                // Check the column
                 if (cols[c][pos]== 1) {
                    return false;
                }
               cols[c][pos] = 1;

                // Check the box
                int idx = (r / 3) * 3 + c / 3;
                if (boxes[idx][pos] == 1) {
                    return false;
                }
                boxes[idx][pos] = 1;

            }
        }
    }

    return true;


    }
}