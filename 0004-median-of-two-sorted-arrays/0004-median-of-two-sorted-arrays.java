class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int k = 0;
        int l = m + n;

        int temp[] = new int[l];

        for (int i = 0; i < l; i++) {
            if (i < n) {
                temp[i] = nums1[i];
            } else {
                temp[i] = nums2[k];
                k++;
            }
        }

        Arrays.sort(temp);

        int mid = l / 2;
        double median = 0;

        if (l % 2 == 0) {
            median = (temp[mid - 1] + temp[mid]) / 2.0;
        } else {
            median = temp[mid];
        }

        return median;
    }
}