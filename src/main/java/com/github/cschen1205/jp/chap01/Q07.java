package com.github.cschen1205.jp.chap01;

/**
 * Created by memeanalytics on 27/6/17.
 * Assume you have a method isSubstring which checks if one word is a substring of another   Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”)
 */
public class Q07 {
    public static boolean isRotation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        String s3 = s2 + s2;
        return s3.contains(s1);
    }
}
