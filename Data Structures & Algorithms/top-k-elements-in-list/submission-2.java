class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] grp = new List[nums.length+1];
        for (int i = 0; i < grp.length; i++) {
            grp[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            grp[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index =0;
        for(int i = grp.length-1;i>=0;i--){
            for(int n :grp[i]){
                res[index++]=n;
                if(index==k){
                    return res;
                }
            }
        }
        
        return res;
    }
}
