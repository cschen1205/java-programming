package com.github.cschen1205.jp.chap02;

/**
 * Created by memeanalytics on 27/6/17.
 * You have two numbers represented by a linked list, where each node contains a single digit   The digits are stored in reverse order, such that the 1’s digit is at the head of the list   Write a function that adds the two numbers and returns the sum as a linked list
 */
public class Q04 {
    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
        public static Node create(int[] values) {
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

    public static Node add(Node n1, Node n2) {
        int carry = 0;
        Node current = null;
        Node first = null;
        while(n1 != null || n2 != null) {
            int val1 = 0;
            int val2 = 0;
            if(n1 != null) val1 = n1.value;
            if(n2 != null) val2 = n2.value;
            int val = val1 + val2 + carry;
            carry = 0;
            if(val > 9) {
                carry = 1;
                val %= 10;
            }
            Node prev = current;
            current = new Node(val);
            current.value = val;
            if(first == null) {
                first = current;
            }
            if(prev != null) {
                prev.next = current;
            }
            if(n1 != null) n1 = n1.next;
            if(n2 != null) n2 = n2.next;
        }

        if(carry == 1) {
            Node prev = current;
            current = new Node(carry);
            prev.next = current;
        }

        return first;
    }
}
