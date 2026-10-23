import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], map.getOrDefault(nums2[i], 0) + 1);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i]) && map.get(nums1[i]) > 0) {
                result[k] = nums1[i];
                k++;
                map.put(nums1[i], map.get(nums1[i]) - 1);
            }
        }

        return Arrays.copyOf(result, k);
    }
}