class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        int left =0;
        int max =0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
