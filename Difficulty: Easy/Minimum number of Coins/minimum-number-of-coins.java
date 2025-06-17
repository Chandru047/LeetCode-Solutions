// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        int[] currency={2000,500,200,100,50,20,10,5,2,1};
        List<Integer> res=new ArrayList<>();
        for(int money:currency){
            while(N>=money){
                res.add(money);
                N-=money;
            }
        }
        return res;
    }
}