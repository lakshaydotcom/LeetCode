import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] merged = new int[len1 + len2];

        int index = 0;

        for (int i = 0; i < len1; i++) {
            merged[index++] = nums1[i];
        }

        for (int i = 0; i < len2; i++) {
            merged[index++] = nums2[i];
        }

        Arrays.sort(merged);

        int n = merged.length;
        if (n % 2 == 1) {
            return merged[n / 2];
        } else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }
    }
}
