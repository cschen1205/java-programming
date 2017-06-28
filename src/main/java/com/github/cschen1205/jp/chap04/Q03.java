package com.github.cschen1205.jp.chap04;

/**
 * Created by memeanalytics on 28/6/17.
 * Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height
 */
public class Q03 {
    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val){
            value = val;
        }
    }

    public static TreeNode addToTree(int[] a, int lo, int hi){
        if(lo > hi) return null;
        int mid = lo + (hi - lo) / 2;
        TreeNode x = new TreeNode(a[mid]);
        x.left = addToTree(a, lo, mid-1);
        x.right = addToTree(a, mid+1, hi);
        return x;
    }

    public static TreeNode createMinBST(int[] a) {
        return addToTree(a, 0, a.length-1);
    }
}
