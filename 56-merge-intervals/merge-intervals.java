import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() 
        {
            public int compare(int[] a, int[] b) 
            {
                if (a[0] > b[0]) 
                {
                    return 1;
                } 
                else if (a[0] == b[0]) 
                {
                    if (a[1] > b[1]) 
                    {
                        return 1;
                    } 
                    else if(a[1] == b[1]) return 0 ;
                    else 
                    {
                        return -1;
                    }
                } 
                else 
                {
                    return -1;
                }
            }
        });

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) 
        {
            if (intervals[i][0] <= end) 
            {
                end = Math.max(end, intervals[i][1]);
            } 
            else 
            {
                res.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        res.add(new int[]{start, end});
        return res.toArray(new int[res.size()][]);
    }
}
