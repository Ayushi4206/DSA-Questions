class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {

            int ans = BinarySearch(i, n - 1, matrix, target);

            if (ans != -1) {
                return true;
            }
        }

        return false;
    }

    public int BinarySearch(int row, int j, int[][] matrix, int target) {

        int k = 0;

        while (k <= j) {

            int mid = (k + j) / 2;

            if (matrix[row][mid] == target) {
                return mid;
            }

            else if (target < matrix[row][mid]) {
                j = mid - 1;
            }

            else {
                k = mid + 1;
            }
        }

        return -1;
    }
}