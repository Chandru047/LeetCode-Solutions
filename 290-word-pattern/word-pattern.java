class Solution {
    public boolean wordPattern(String pattern, String s) {
      HashMap<Character,String> map = new HashMap<>();
      HashSet<String> set = new HashSet<>();
        String[] split = s.split(" ");
        if(split.length != pattern.length()){
            return false;
        }
        for(int i=0;i<split.length;i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(set.contains(split[i])){
                    return false;
                }
                set.add(split[i]);
                map.put(pattern.charAt(i),split[i]);
            }

            else if(!map.get(pattern.charAt(i)).equals(split[i])){
                return false;
            }
        }
        return true;

    }
}