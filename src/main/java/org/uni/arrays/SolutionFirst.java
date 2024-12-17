package org.uni.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SolutionFirst {

    public int maxRepeats(int[] nums) {
        ArrayList<Integer> repeatablePlus = new ArrayList<>();

        int repeats = 0;
        for (Integer i : nums) {
            if (i == 1) {
               repeats++;
            } else {
                repeatablePlus.add(repeats);
                repeats = 0;
            }
        }

        if (repeats != 0) {
            repeatablePlus.add(repeats);
        }

        repeatablePlus.sort(Collections.reverseOrder());
        return repeatablePlus.get(0);
    }
}
