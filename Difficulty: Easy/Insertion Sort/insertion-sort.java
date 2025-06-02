class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++)
        {
            int min = i ; 
            for(int j = i ; j < arr.length - 1; j++)
            {
                if(arr[j + 1] < arr[min]) min = j + 1 ;
            }
            int temp = arr[i] ; 
            arr[i] = arr[min] ;
            arr[min] = temp ;
        }
        
    }
}