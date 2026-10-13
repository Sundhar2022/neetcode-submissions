class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        char r;
        int max =0;
        int startIndex =0;
        Map<Character,Integer> map = new HashMap<>();
        int pivot =0;
        for(int i =0;i<s.length();i++){
            r= s.charAt(i);
            if(map.containsKey(r)){
                pivot = Math.max(pivot,map.get(r)+1);
            }
            map.put(r,i);
            if(max<i-pivot+1){
                max = i-pivot+1;
                startIndex = pivot;
            }
            //max = Math.max(max,(i-pivot));
            
        }
        System.out.println("subString :"+ s.substring(startIndex, startIndex + max));
        return max;
    }
}
