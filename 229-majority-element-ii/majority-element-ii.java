class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candi1 = 0, candi2 = 0;
        int count1 = 0, count2 = 0;
        int n = nums.length;

        for(int num: nums)
        {
            if(candi1==num) count1++;
            else if(candi2==num) count2++;
            else if(count1==0)
            {
                candi1=num;
                count1=1;
            }
            else if(count2==0)
            {
                candi2=num;
                count2=1;
            }
            else 
            {
                count1--; count2--;
            }
        }

        count1=0;
        count2=0;
        for(int num : nums)
        {
            if (num==candi1) count1++;
            else if(num==candi2) count2++;
        }

        List<Integer> ans = new ArrayList<>();
        if(count1>n/3) ans.add(candi1);
        if(count2>n/3 && candi1!=candi2) ans.add(candi2);
        return ans;
    }
}