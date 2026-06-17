class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        char r;
        int max =0;
        Map<Character,Integer> map = new HashMap<>();
        int pivot =0;
        for(int i =0;i<s.length();i++){
            r= s.charAt(i);
            if(map.containsKey(r)){
                pivot = Math.max(pivot,map.get(r)+1);
            }
            map.put(r,i);
            max = Math.max(max,(i-pivot+1));
        }
        return max;
    }
}
