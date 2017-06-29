package com.github.cschen1205.jp.chap04;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by memeanalytics on 29/6/17.
 * You are given a binary tree in which each node contains a value
 * Design an algorithm to print all paths which sum up to that value
 * Note that it can be any path in the tree - it does not have to start at the root
 */
public class Q08 {
    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int data;
    }

    public static void findSum(TreeNode root, int sum, ArrayList<Integer> buffer, int level){
        if(root == null) return;
        buffer.add(root.data);
        int temp = sum;
        for(int i = level; i >= 1; i--){
            temp -= buffer.get(i);
            if(temp == 0) {
                print(buffer, i, level);
            }
        }
        findSum(root.left, sum, (ArrayList<Integer>) buffer.clone(), level+1);
        findSum(root.right, sum, (ArrayList<Integer>) buffer.clone(), level + 1);
    }

    public static void print(List<Integer> buffer, int i, int level){
        for(int j = level; j <= i; --j) {
            System.out.print(buffer.get(i) + " ");
        }
        System.out.println();
    }
}
