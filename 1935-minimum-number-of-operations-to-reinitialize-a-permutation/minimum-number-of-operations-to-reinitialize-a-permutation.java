class Solution {
    public int reinitializePermutation(int n) {
        int[] perm = new int[n];
        int [] temp = new int[n];
        int count = 1 ;
        for(int i = 0 ; i < n ; i++){
            perm[i] = i ;
            temp[i] = i ;
        }
        int[] arr = new int[n] ;
        for(int j = 0 ; j < n ; j++){
            for(int i = 0 ; i < n ; i++){
            if(i % 2 == 0)
            {
                arr[i] = perm[i/2];
            }
            else if(i % 2 == 1)
            {    
                    arr[i] = perm[n / 2 + (i - 1) / 2] ; 
            }  
        }
        if(Arrays.equals(temp,arr)){
                break ;
            }
            else{
                count++ ;
            }
            perm = Arrays.copyOf(arr, arr.length);
        }
        
        
        return count ;
    }
}