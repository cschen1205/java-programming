package com.github.cschen1205.jp.chap05;

/**
 * Created by memeanalytics on 29/6/17.
 * Write a function to determine the number of bits required to convert integer A to integer B
 */
public class Q05 {
    public static int bitSwapRequired(int a, int b){
        int count = 0;
        for(int c = a ^ b; c > 0; c = c >> 1) {
            if((c & 1) > 0) count++;
        }
        return count;
    }
}
