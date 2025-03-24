class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i <= m/2; i++)
        {
            for(int j = i; j < n-i   && res.size() != m*n; j++)    res.add(matrix[i][j]);
            for(int j = i+1; j < m-i && res.size() != m*n; j++)    res.add(matrix[j][n-i-1]);
            for(int j = n-i-2; j >= i && res.size() != m*n; j--)   res.add(matrix[m-i-1][j]);
            for(int j = m-i-2; j > i && res.size() != m*n; j--)    res.add(matrix[j][i]);
        }
        return res;
    }
}