class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int width = matrix[0].length - 1;
    int i = 0;
    while (i < matrix.length) {
        int l = 0, r = width;
        while (l <= r && target >= matrix[i][0] && target <= matrix[i][width]) {
            int mid = l + (r - l) / 2;
            if (matrix[i][mid] == target) return true;
            if (matrix[i][mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        i++;
    }
    return false;
}

}
