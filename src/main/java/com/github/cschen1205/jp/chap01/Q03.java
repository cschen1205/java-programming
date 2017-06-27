package com.github.cschen1205.jp.chap01;

/**
 * Created by memeanalytics on 27/6/17.
 * Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer
 * NOTE: One or two additional variables are fine
 * An extra copy of the array is not
 */
public class Q03 {
    public static char[] removeDuplicate(char[] s) {
        boolean[] duplicated = new boolean[256];
        int tail = 0;
        for(int i=0; i < s.length; ++i) {
            if(!duplicated[s[i]]) {
                s[tail++] = s[i];
            }
            duplicated[s[i]] = true;
        }
        s[tail] = 0;
        return s;
    }
}
