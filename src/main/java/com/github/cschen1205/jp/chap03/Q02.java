package com.github.cschen1205.jp.chap03;

import java.util.Stack;

/**
 * Created by memeanalytics on 27/6/17.
 * How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element? Push, pop and min should all operate in O(1) time
 */
public class Q02 {
    public static class StackWithMin<T extends Comparable<T>> extends Stack<T> {
        private Stack<T> s2 = new Stack<>();
        @Override
        public T push(T item) {
            if(min().compareTo(item) > 0){
                s2.push(item);
            }
            return super.push(item);
        }

        public T min() {
            if(s2.isEmpty()) return null;
            return s2.peek();
        }

        @Override
        public synchronized T pop() {



            if(!isEmpty()) {
                T val = peek();
                if(val.equals(min())) {
                    s2.pop();
                }
            }


            return super.pop();
        }
    }
}
