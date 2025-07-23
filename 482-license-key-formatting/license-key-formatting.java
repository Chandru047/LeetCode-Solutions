class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.toUpperCase();
        String[] arr1=s.split("\\-+");
        s="";
        for(String i:arr1){
            s+=i;
        }
        String out="";
        int n=s.length();
        int count=0;
        for(int i=n-1;i>=0;i--){
           
            out+=s.charAt(i);
            count++;
            if(i!=0 && count == k){
                out+="-";
                count=0;
            }
        }
        StringBuilder sb=new StringBuilder(out);
        sb.reverse();
        
        return sb.toString();
        
    }
}