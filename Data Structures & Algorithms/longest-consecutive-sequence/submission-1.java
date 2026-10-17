class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        int len = 1;
        for(int i =0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        for(int i =1;i<nums.length;i++){
            int left = i-1;
            if(nums[i]-nums[left] == 1){
                len++;
                max = Math.max(max,len);
            }else if(nums[i]-nums[left] == 0){}
            else{
                len = 1;
            }
        }
        return max;
    }
}
