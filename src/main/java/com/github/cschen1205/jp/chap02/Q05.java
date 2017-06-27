package com.github.cschen1205.jp.chap02;

/**
 * Created by memeanalytics on 27/6/17.
 * Given a circular linked list, implement an algorithm which returns node at the beginning of the loop
 */
public class Q05 {
    public static class Node {
        public Node next;
        public char value;
        public Node(char value) {
            this.value = value;
        }

        public static Node create(char[] values) {
            Node prev = null;
            Node head = null;
            for(int i=0; i < values.length; ++i){
                Node n = new Node(values[i]);
                if(i == 0) {
                    head = n;
                } else {
                    prev.next = n;
                }
                prev = n;
            }
            return head;
        }

        public String toString(){
            StringBuilder sb = new StringBuilder();
            Node x = this;
            while(x != null) {
                if(x != this) {
                    sb.append("->");
                }
                sb.append(x.value);

                x = x.next;
            }
            return sb.toString();
        }
    }

    public static Node find(Node head) {
        Node n1 = head;
        Node n2 = head;

        while(n2.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
            if(n1 == n2) {
                break;
            }
        }

        if(n2.next == null) {
            return null;
        }

        n1 = head;
        while(n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
    }
}
