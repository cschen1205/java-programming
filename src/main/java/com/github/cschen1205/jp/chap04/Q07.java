package com.github.cschen1205.jp.chap04;

/**
 * Created by memeanalytics on 29/6/17.
 * You have two very large binary trees: T1, with millions of nodes, and T2, with hundreds of nodes
 * Create an algorithm to decide if T2 is a subtree of T1
 */
public class Q07 {
    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public Object data;
    }

    public boolean containsTree(TreeNode t1, TreeNode t2) {
        if(t2 == null) return true;
        return subTree(t1, t2);
    }

    public boolean subTree(TreeNode t1, TreeNode t2) {
        if(t1 == null) return false;
        if(t1 == t2) {
            return matchTree(t1, t2);
        }
        return subTree(t1.left, t2) || subTree(t1.right, t2);
    }

    public boolean matchTree(TreeNode t1, TreeNode t2) {
        if(t1 != null && t2 == null) return false;
        if(t1 == null && t2 != null) return false;
        if(t1.data != t2.data) return false;
        return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
    }
}
