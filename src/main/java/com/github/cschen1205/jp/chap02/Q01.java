package com.github.cschen1205.jp.chap02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by memeanalytics on 27/6/17.
 * Write code to remove duplicates from an unsorted linked list
 */
public class Q01 {
    public static class Node {
        public Node next;
        public String data;
    }

    // temporary buffer allowed
    public static void deleteDuplicates(Node head) {
        Set<String> unique = new HashSet<>();
        Node x = head;
        Node prev = null;
        while(x != null) {
            if(unique.contains(x.data)){
                prev.next = x.next;
            } else {
                unique.add(x.data);
                prev = x;
            }
            x = x.next;
        }
    }

    // without buffer
    public static void deleteDuplicates2(Node head) {
        Node x = head;
        Node prev = null;
        while(x != null) {
            boolean duplicated = false;
            Node runner = head;
            while(runner != x) {
                if(runner.data.equals(x.data)) {
                    duplicated = true;
                    break;
                }
                runner = runner.next;
            }
            if(duplicated) {
                prev.next = x.next;
            } else {
                prev = x;
            }
            x = x.next;
        }
    }
}
