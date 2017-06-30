package com.github.cschen1205.jp.chap05;

/**
 * Created by memeanalytics on 30/6/17.
 */
public class Q03 {
    public static boolean getBit(int n, int index) {
        return (n & (1 << index)) > 0;
    }

    public static int setBit(int n, int index, boolean b) {
        if(b) {
            return n | (1 << index);
        } else {
            int mask = ~(1 << index);
            return n & mask;
        }
    }

}
