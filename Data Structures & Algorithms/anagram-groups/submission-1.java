class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            int chars[] = new int[26];
            for(int i=0;i<s.length();i++){
                chars[s.charAt(i)-'a']++;
            }
            String st = Arrays.toString(chars);
            map.computeIfAbsent(st, k -> new ArrayList<>()).add(s);
        }
        List<List<String>> result = new ArrayList<>(map.values());
        
        return result;
    }
}
