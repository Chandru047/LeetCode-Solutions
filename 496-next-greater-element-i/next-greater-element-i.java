class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int i = nums2.length - 1 ;
        int index = i ;
        Stack<Integer> st = new Stack<>();
        int[] x = new int[nums2.length];
        while(i>=0)
        {
           
            while(!st.isEmpty() && nums2[i] >= st.peek())
            {
                st.pop();
            }
             if(st.isEmpty())
            {
                x[index] = - 1 ;
               
            }
            else
            {
                x[index] = st.peek();
            }
            st.push(nums2[i]);
            i-- ;
            index-- ;
        }
        int[] res = new int[nums1.length];
        for(int k = 0 ; k < nums1.length ; k++)
        {
            for(int j = 0 ; j < nums2.length ; j++)
            {
                if(nums1[k] == nums2[j])
                {
                    res[k] = x[j];
                    break ;
                }
            }
        }
        return res ;
    }
}