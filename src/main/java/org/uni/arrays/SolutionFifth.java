package org.uni.arrays;

public class SolutionFifth {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int currentIndex = m + n - 1;

        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] > nums2[index2]) {
                nums1[currentIndex] = nums1[index1];
                index1--;
            } else {
                nums1[currentIndex] = nums2[index2];
                index2--;
            }
            currentIndex--;
        }

        while (index2 >= 0) {
            nums1[currentIndex] = nums2[index2];
            index2--;
            currentIndex--;
        }

        return nums1;
    }
}
