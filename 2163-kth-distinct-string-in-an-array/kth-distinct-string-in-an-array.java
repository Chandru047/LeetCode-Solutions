class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        int sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }

        for(int i = 0 ; i< arr.length ;i++)
        {
            
            if(map.get(arr[i])==1)
            {
                sum += 1 ;
                if(sum ==k)
                {
                    return arr[i];
                }
            }
        }
        return "";
    }
}