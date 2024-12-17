package org.uni.recursion;

public class SolutionFourth {
    public int uniqueWaysToClimb(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return uniqueWaysToClimb(n - 1) + uniqueWaysToClimb(n - 2);
    }
}
