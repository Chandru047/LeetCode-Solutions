// User function Template for Java

class Solution {
    public void immediateSmaller(int arr[]) 
    {
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length - 1 ; i >= 0 ; i--)
        {
            int temp = arr[i];
            if(st.isEmpty())
            {
                  arr[i] = -1 ;
                  st.push(temp);
            }
            if(st.peek() < arr[i])
            {
                arr[i] = st.peek();
                st.push(temp);
            }
            else
            {
                arr[i] = -1 ;
                st.push(temp);
            }
        }
        
    }
}