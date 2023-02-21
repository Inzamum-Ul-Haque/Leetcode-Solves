package Binary_Search;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, res, 0, nums1.length);
        System.arraycopy(nums2, 0, res, nums1.length, nums2.length);
        Arrays.sort(res);

        int l = 0, r = res.length - 1;
        int mid = (l + r) / 2;

        if (res.length % 2 == 0) {
            return (double) (res[mid] + res[mid + 1]) / 2;
        } else {
            return (double) res[mid];
        }

    }
}
