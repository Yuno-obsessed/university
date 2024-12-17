package org.uni.trees;

import org.uni.utils.TreeNode;

public class SolutionSecond {

    public static boolean isSymmetric(TreeNode root) {
        return symmetric(root.left, root.right);
    }

    private static boolean symmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return symmetric(left.left, right.right) && symmetric(left.right, right.left);
    }

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);

        System.out.println("Output: " + isSymmetric(root1));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = null;
        root2.left.right = new TreeNode(3);
        root2.right.left = null;
        root2.right.right = new TreeNode(3);

        System.out.println("Output: " + isSymmetric(root2));
    }
}
