class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int l =0;
        int r = len-1;
        int max = 0;
        if(len<2) return 0;
        while(l<r){
            int b = r-l;
            int h = heights[r] > heights[l] ? heights[l] : heights[r];
            max = Math.max(b*h,max);
            if(h==heights[l]){
                l++;
            }else r--;
        }
        return max;

    }
}
