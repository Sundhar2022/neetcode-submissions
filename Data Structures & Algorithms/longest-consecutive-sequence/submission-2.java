class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int max = 0;
        int current;
        int length;
        for(int a : set){
            if(!set.contains(a-1)){
                current = a;
                length = 1;
                while(set.contains(current+length)){
                    length++;
                }
                max = Math.max(max, length);
            }
        }
        return max;
    }
}
