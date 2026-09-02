class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros = 0;
        int zeroIndex = -1;
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i] ==0){
                zeros++;
                zeroIndex = i;
            }
        }
        
        int[] product = new int[len];
        if(zeros>1){}
        else if(zeros == 1){
            int leftProduct =1;
            int rightProduct =1;
            if(0<=zeroIndex-1){
                leftProduct = product(0,zeroIndex-1, nums);
            }
            if(zeroIndex+1<=len-1){
                rightProduct = product(zeroIndex+1,len-1, nums);
            }
            product[zeroIndex] = leftProduct * rightProduct;
        }
        else{
            int prod = product(0,len-1,nums);
            int i = 0;
            for(int num : nums){
                product[i]=prod/num;
                i++;
            }
        }
        return product;
    }

    public int product(int i, int j, int[] nums){
        int product = 1;
        for(int x = i;x<=j;x++){
            product = nums[x] * product;
            if(product ==0){
                return 0;
            }
        }
        return product;
    }
}  
