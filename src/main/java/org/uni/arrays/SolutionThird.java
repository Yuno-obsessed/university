package org.uni.arrays;

import java.util.Arrays;

public class SolutionThird {

    public int[] powArray(int[] nums) {
        int[] powNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int curr = (int) Math.pow(nums[i], 2);
            powNums[i] = curr;
        }
        Arrays.sort(powNums);

        return powNums;
    }

}
