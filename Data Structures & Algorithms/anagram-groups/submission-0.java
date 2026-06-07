class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] chars = new int[26];
            for(int i =0;i<str.length();i++){
                chars[str.charAt(i)-'a']++;
            }
            String s = Arrays.toString(chars);
            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(str);
        }
        List<List<String>> result = new ArrayList<>(map.values()); 
        return result;
    }
}
