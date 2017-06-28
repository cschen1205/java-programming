package com.github.cschen1205.jp.chap03;

import java.util.Stack;

/**
 * Created by memeanalytics on 28/6/17.
 * Write a program to sort a stack in ascending order
 * You should not make any assumptions about how the stack is implemented
 * The following are the only functions that should be used to write this program: push | pop | peek | isEmpty
 */
public class Q06 {
    public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> r = new Stack<>();
        while(!s.isEmpty()) {
            int temp = Integer.MIN_VALUE;
            while(!r.isEmpty() && r.peek() < temp) {
                s.push(r.pop());
            }
            r.push(temp);
        }
        return r;
    }
}
