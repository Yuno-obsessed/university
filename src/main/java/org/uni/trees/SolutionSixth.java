package org.uni.trees;

import org.uni.utils.TreeNode;

public class SolutionSixth {

    private static int maxSum = Integer.MIN_VALUE; // Глобальна змінна для максимальної суми

    public static int maxPathSum(TreeNode root) {
        calculateMaxPath(root);
        return maxSum;
    }

    private static int calculateMaxPath(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftMax = Math.max(0, calculateMaxPath(node.left));
        int rightMax = Math.max(0, calculateMaxPath(node.right));

        int currentPathSum = node.val + leftMax + rightMax;
        maxSum = Math.max(maxSum, currentPathSum);

        return node.val + Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        System.out.println("Output: " + maxPathSum(root1));

        TreeNode root2 = new TreeNode(-10);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(20);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);

        System.out.println("Output: " + maxPathSum(root2));
    }
}
