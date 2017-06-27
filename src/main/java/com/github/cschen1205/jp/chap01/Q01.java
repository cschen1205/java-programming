package com.github.cschen1205.jp.chap01;

/**
 * Created by memeanalytics on 27/6/17.
 * Implement an algorithm to determine if a string has all unique characters
 * What if you can not use additional data structures?
 */
public class Q01 {
    public static boolean isUniqueChars2(String str) {
        boolean[] unique = new boolean[256];
        for(int i=0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if(unique[c]) return false;
            unique[c] = true;
        }
        return true;
    }

    // We can reduce our space usage a little bit by using a bit vector   We will assume, in the below code, that the string is only lower case ‘a’ through ‘z’
    // This will allow us to use just a single int
    public static boolean isUniqueChars(String str) {
        int checker = 0;
        for(int i=0; i < str.length(); ++i) {
            int a  = str.charAt(i) - 'a';
            if((checker & (1 << a)) > 0) return false;
            checker |= (1 << a);
        }
        return true;
    }
}
