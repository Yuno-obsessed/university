package org.uni.arrays;

import org.uni.utils.Output;

public class SolutionSixth {

    public Output<Integer, int[]> removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Не потрібно по умові, але для краси і точності тестів додано
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }

        return new Output<>(k, nums);
    }

}
