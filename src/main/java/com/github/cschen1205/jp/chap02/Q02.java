package com.github.cschen1205.jp.chap02;

/**
 * Created by memeanalytics on 27/6/17.
 * Implement an algorithm to find the nth to last element of a singly linked list
 */
public class Q02 {
    public static class Node {
        public Node next;
    }
    public static Node findNToLast(Node head, int N) {
        Node p1 = head;
        Node p2 = head;
        for(int i=0; i < N; ++i) {
            if(p2 == null) {
                return null;
            }
            p2 = p2.next;
        }
        while(p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
