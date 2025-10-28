class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < rows.length; i++) {
            if (rows[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < cols.length; i++) {
            if (cols[i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        // boolean anyZeroRow = false;
        // boolean anyZeroCol = false;

        // for (int i = 0; i < matrix[0].length; i++) {
        //     if (matrix[0][i] == 0) {
        //         anyZeroRow = true;
        //         break;
        //     }
        // }
        // for (int i = 0; i < matrix.length; i++) {
        //     if (matrix[i][0] == 0) {
        //         anyZeroCol = true;
        //         break;
        //     }
        // }
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (matrix[i][j] == 0) {
        //             matrix[i][0] = 0;
        //             matrix[0][j] = 0;
        //         }
        //     }
        // }

        // for (int i = 1; i < matrix.length; i++) {
        //     if (matrix[i][0] == 0) {
        //         for (int j = 0; j < matrix[0].length; j++) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        // for (int i = 1; i < matrix[0].length; i++) {
        //     if (matrix[0][i] == 0) {
        //         for (int j = 0; j < matrix.length; j++) {
        //             matrix[j][i] = 0;
        //         }
        //     }
        // }

        // if (anyZeroRow) {

        //     for (int i = 0; i < matrix[0].length; i++) {
        //         matrix[0][i] = 0;
        //     }
        // }
        // if (anyZeroCol) {

        //     for (int i = 0; i < matrix.length; i++) {
        //         matrix[i][0] = 0;
        //     }
        // }
    }
}
