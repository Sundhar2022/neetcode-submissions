class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length -1;
        int max =0;
        int w =0;
        int h =0;
        while(l<r){
            w = r - l;
            h = Math.min(heights[l],heights[r]);
            max = Math.max(max,w*h);
            if(heights[l]<=heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
