package com.github.cschen1205.jp.chap04;

/**
 * Created by memeanalytics on 28/6/17.
 */
public class Q01 {
    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
    }
    public static boolean isBalance(TreeNode root) {
        return maxDepth(root) - minDepth(root) <= 1;
    }
    public static int maxDepth(TreeNode x){
        if(x == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(x.left), maxDepth(x.right));
    }
    public static int minDepth(TreeNode x) {
        if(x == null) {
            return 0;
        }
        return 1 + Math.min(minDepth(x.left), minDepth(x.right));
    }
}
