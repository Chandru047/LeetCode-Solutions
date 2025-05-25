class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        for (int x = 0; x < 4; x++) {
            boolean equal = true;

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (mat[i][j] != target[i][j]) {
                        equal = false;
                        break;
                    }
                }
                if (!equal) break;
            }

            if (equal) return true;

            int[][] temp = new int[mat.length][mat.length];
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    temp[j][mat.length - 1 - i] = mat[i][j];
                }
            }
            mat = temp;
        }

        return false;
    }
}
