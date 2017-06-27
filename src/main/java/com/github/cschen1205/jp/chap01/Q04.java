package com.github.cschen1205.jp.chap01;

/**
 * Created by memeanalytics on 27/6/17.
 * Write a method to decide if two strings are anagrams or not
 */
public class Q04 {
    public static boolean anagram(String s, String t) {
        if(s.length() != s.length()) return false;

        int uniqueCharCount = 0;
        int[] counts = new int[256];
        for(int i=0; i < s.length(); ++i) {
            if(counts[s.charAt(i)] == 0) {
                uniqueCharCount++;
            }
            counts[s.charAt(i)]++;
        }
        int completed_t = 0;
        for(int i=0; i < t.length(); ++i) {
            char c = t.charAt(i);
            if(counts[c] == 0){
                return false;
            }
            counts[c]--;
            if(counts[c] == 0) {
                completed_t++;
                if(completed_t == uniqueCharCount) {
                    return i == t.length()-1;
                }
            }
        }
        return true;
    }
}
