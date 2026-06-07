class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i =0;i<len-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l =i+1;
            int r = len-1;
            while(l<r){
                if(nums[l]+nums[r]+nums[i]==0){
                    List<Integer> triplet = Arrays.asList(nums[i],nums[l],nums[r]);
                    list.add(triplet);
                    l++; r--;
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                } 
                else if(nums[l]+nums[r]+nums[i]>0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return list;
    }
}
