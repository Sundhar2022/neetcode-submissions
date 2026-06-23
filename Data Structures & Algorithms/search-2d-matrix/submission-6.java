class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int top = 0,bottom = r-1;
        while(top<=bottom){
            int mid = top +  (bottom-top)/2;
            if(target< matrix[mid][0]){
                bottom = mid -1;
            }else if(target > matrix[mid][c-1]){
                top = mid +1;
            }
            else {
                int l =0,k=c-1;
                while(l<=k){
                int m = l + (k-l)/2;
                if(target==matrix[mid][m]) return true;
                else if(target<matrix[mid][m]){
                    k = m -1;
                }else {
                    l = m +1;
                }
                }
                return false;
            }
        }
        return false;
    }
}
