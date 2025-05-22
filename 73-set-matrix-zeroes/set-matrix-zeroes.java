class Solution {
    public void setZeroes(int[][] matrix) 
    {
        boolean found  ;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < matrix.length ;i++)
        {
            found  = false;
            for(int j = 0 ; j < matrix[i].length ;j++)
            {
                if(matrix[i][j] == 0) 
                {
                    found = true ;
                    arr.add(j);
                }
            }
            if(found)
            {
                 Arrays.fill(matrix[i],0);
            }
           
        } 
        for(int i = 0 ; i < matrix.length;i++)
        {
           for(int j = 0 ; j < matrix[i].length ;j++)
           {
            if(arr.contains(j))
            {
                matrix[i][j] = 0 ;
            }
           } 
        }  
    }
}