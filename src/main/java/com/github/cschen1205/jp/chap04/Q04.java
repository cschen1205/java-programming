package com.github.cschen1205.jp.chap04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by memeanalytics on 28/6/17.
 */
public class Q04 {
    public static class TreeNode {
        TreeNode left;
        TreeNode right;
    }
    public static List<List<TreeNode>> findLevelLinkedList(TreeNode root) {
        int level =0;
        List<List<TreeNode>> result = new ArrayList<>();
        List<TreeNode> list = new LinkedList<>();
        list.add(root);
        result.add(level, list);
        while(true){
            list = new LinkedList<>();
            for(int i=0; i < result.get(level).size(); ++i) {
                TreeNode n = result.get(level).get(i);
                if(n.left != null) list.add(n.left);
                if(n.right != null) list.add(n.right);
            }
            if(list.isEmpty()) {
                break;
            }
            result.add(list);
            level++;
        }
        return result;
    }
}
