package org.uni.arrays;

public class SolutionFourth {

    public int[] duplicateZeros(int[] nums) {
        int n = nums.length;
        int shift = 0;

        for (int i = 0; i < n - shift; i++) {
            if (nums[i] == 0) {
                if (i == n - shift - 1) {
                    nums[n - 1] = 0;
                    n--;
                    break;
                }
                shift++;
            }
        }

        for (int i = n - shift - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                nums[i + shift] = 0;
                shift--;
                nums[i + shift] = 0;
            } else {
                nums[i + shift] = nums[i];
            }

        }

        return nums;
    }

}
