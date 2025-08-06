public class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // 1. Check if first row and first column have any zeros
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // 2. Use first row and column as markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;  // mark row
                    matrix[0][j] = 0;  // mark column
                }
            }
        }

        // 3. Set matrix cells to 0 based on markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 4. Handle first row and column
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         boolean[] rowZero = new boolean[rows];
//         boolean[] colZero = new boolean[cols];

//         // Step 1: Mark all rows and columns that need to be zeroed
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == 0) {
//                     rowZero[i] = true;
//                     colZero[j] = true;
//                 }
//             }
//         }

//         // Step 2: Set the marked rows and columns to 0
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (rowZero[i] || colZero[j]) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
// }
// for (i=0;i<=row;i++)
// { 
//     if(matrix[i][0]==0){
//     for (j=0;j<=i;j++)
//     {
//         matrix[0][j]==0;
//         matrix[j][0]==0;
//     }
// }}
