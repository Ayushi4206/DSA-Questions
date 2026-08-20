class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int left = 0;
        int right = cols - 1;
        while (left<=right) {
            int mid=(left+right)/2;
            int row=0;
            for (int i=1;i<rows;i++) {
                if (mat[i][mid]>mat[row][mid]) {
                    row=i;
                }
            }
            int current=mat[row][mid];
            int leftValue=-1;
            int rightValue=-1;
            if (mid>0) {
                leftValue=mat[row][mid - 1];
            }
            if (mid < cols - 1) {
                rightValue = mat[row][mid + 1];
            }
            if (current > leftValue && current > rightValue) {
                return new int[]{row, mid};
            }
            if (leftValue > current) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}