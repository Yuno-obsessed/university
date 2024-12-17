package org.uni.arrays;

public class SolutionSeventh {

    public boolean hasDouble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == 2 * nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
