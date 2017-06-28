package com.github.cschen1205.jp.chap04;

/**
 * Created by memeanalytics on 28/6/17.
 * Write an algorithm to find the ‘next’ node (e g , in-order successor) of a given node in a binary search tree
 * where each node has a link to its parent
 */
public class Q05 {
    public static class TreeNode {
        public TreeNode parent;
        public TreeNode left;
        public TreeNode right;
    }

    public static TreeNode min(TreeNode e){
        if(e.left == null){
            return e;
        }
        return min(e.left);
    }

    public static TreeNode inorderSucc(TreeNode e) {

        TreeNode p = null;
        if(e != null) {
            if(e.right != null || p.parent == null){
                p = min(e);
            } else {
                TreeNode x = e;
                while(x != null){
                    p = x;
                    if(p.left == e) {
                        break;
                    }
                    x = x.parent;
                }
            }
        }
        return p;
    }

}
