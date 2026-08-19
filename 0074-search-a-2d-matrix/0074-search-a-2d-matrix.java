class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int k = 0;
        int j = m * n - 1;
        while (k <= j) {
            int mid = (k + j) / 2;
            int i = mid / n;
            int col = mid % n;
            if (matrix[i][col] == target) {
                return true;
            }
            else if (target < matrix[i][col]) {
                j = mid - 1;
            }
            else {
                k = mid + 1;
            }
        }
        return false;
    }
}