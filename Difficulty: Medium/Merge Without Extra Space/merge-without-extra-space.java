class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i = a.length - 1 ; 
        int j = 0 ; 
        while(i >= 0 && j < b.length && a[i] > b[j]){
            int temp = a[i];
            a[i] = b[j] ;
            b[j] = temp ;
            i-- ;
            j++ ;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
