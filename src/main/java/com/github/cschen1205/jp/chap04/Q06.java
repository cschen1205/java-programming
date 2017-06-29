package com.github.cschen1205.jp.chap04;

/**
 * Created by memeanalytics on 29/6/17.
 * Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree
 * Avoid storing additional nodes in a data structure
 * NOTE: This is not necessarily a binary search tree
 */
public class Q06 {
    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
    }

    public TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(covers(root.left, p) && covers(root.left, q)){
            return commonAncestor(root.left, p, q);
        }
        if(covers(root.right, p) && covers(root.right, q)) {
            return commonAncestor(root.right, p, q);
        }
        return root;
    }

    public boolean covers(TreeNode root, TreeNode p){
        if(root==null) return false;
        if(root == p) return true;
        return covers(root.left, p) || covers(root.right, p);
    }
}
