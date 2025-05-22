class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> colsToZero = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            boolean rowHasZero = false;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowHasZero = true;
                    colsToZero.add(j);
                }
            }
            if (rowHasZero) {
                Arrays.fill(matrix[i], 0); 
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j : colsToZero) {
                matrix[i][j] = 0; 
            }
        }
    }
}
