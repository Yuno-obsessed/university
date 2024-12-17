package org.uni.trees;

import org.uni.utils.TreeNode;

public class SolutionSeventh {

    public static int minCameraCover(TreeNode root) {
        int[] result = dfs(root);
        return result[1] == 1 ? result[0] + 1 : result[0];
    }

    private static int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[] {0, 0};
        }

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int[] result = new int[2];

        if (left[1] == 0 || right[1] == 0) {
            result[0] = left[0] + right[0] + 1;
            result[1] = 2;
        }
        else if (left[1] == 2 || right[1] == 2) {
            result[0] = left[0] + right[0];
            result[1] = 1;
        }
        else {
            result[0] = left[0] + right[0];
            result[1] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.left.left = new TreeNode(0);
        root.left.left.left.left = new TreeNode(0);

        System.out.println(minCameraCover(root));
    }
}
