class Solution 
{
    public boolean canBeEqual(int[] target, int[] arr) 
    {
        Arrays.sort(target);
        Arrays.sort(arr);
        boolean bool = true ;
        for(int i = 0 ; i < target.length ; i++)
        {
            if(!(arr[i] == target[i])) bool = false ;
        }

        return bool ;
    }
}