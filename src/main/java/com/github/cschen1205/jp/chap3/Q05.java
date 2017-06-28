package com.github.cschen1205.jp.chap3;

import java.util.Stack;

/**
 * Created by memeanalytics on 28/6/
 * Implement a MyQueue class which implements a queue using two stacks
 */
public class Q05 {
    public static class MyQueue<T> {
        private Stack<T> s1 = new Stack<>();
        private Stack<T> s2 = new Stack<>();

        public void enqueue(T item) {
            s1.push(item);
        }

        public T dequeue() {
            if(!s2.isEmpty()) s2.pop();
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }


    }
}
