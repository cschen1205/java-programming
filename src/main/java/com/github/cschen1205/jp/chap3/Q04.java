package com.github.cschen1205.jp.chap3;

import java.util.Stack;

/**
 * Created by memeanalytics on 28/6/17.
 * In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different sizes which can slide onto any tower   The puzzle starts with disks sorted in ascending order of size from top to bottom (e g , each disk sits on top of an even larger one)  You have the following constraints
 * (A) Only one disk can be moved at a time
 * (B) A disk is slid off the top of one rod onto the next rod
 * (C) A disk can only be placed on top of a larger disk
 *
 * Write a program to move the disks from the first rod to the last using Stacks
 */
public class Q04 {
    public static class Tower {
        private Stack<Integer> disks;
        private int index;
        public Tower(int i) {
            disks = new Stack<>();
            index = i;
        }

        public int index() {
            return index;
        }

        public void add(int d) {
            if(!disks.isEmpty() && disks.peek() <= d) {
                System.out.println("Error placing disk " + d);
            } else {
                disks.push(d);
            }
        }

        public void moveTopTo(Tower t) {
            int top = disks.pop();
            t.add(top);
            System.out.println("Move disk " + top + " from " + index() + " to " + t.index());
        }

        public void print(){
            System.out.println("Çontents of Tower " + index());
            for(int i= disks.size()-1; i>=0; i--) {
                System.out.println("  " + disks.get(i));
            }
        }

        public void moveDisks(int n, Tower destination, Tower buffer) {
            if(n > 0){
                moveDisks(n-1, buffer, destination);
                moveTopTo(destination);
                buffer.moveDisks(n-1, destination, this);
            }
        }

    }


}
