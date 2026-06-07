class Solution {
    public boolean isPalindrome(String s) {
        String alphaNum = s.replaceAll("[^a-zA-Z0-9]","");
        alphaNum = alphaNum.toLowerCase();
        int left =0;
        int right = alphaNum.length()-1;
        while(left<right){
            if(alphaNum.charAt(left)!=alphaNum.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
