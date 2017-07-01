package com.github.cschen1205.jp.chap08;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by memeanalytics on 2/7/17.
 * Write a method to compute all permutations of a string
 */
public class Q04 {

    public static List<String> getPerms(String s) {
        return getPerms(s, "", 0);
    }

    public static List<String> getPerms(String s, String prefix, int index) {
        List<String> result = new ArrayList<>();
        if(s.length()==0)
            result.add(prefix);
        for(int i=0; i< s.length(); ++i) {

            result.addAll(getPerms(removeChar(s, i), prefix + s.charAt(i), index+1));
        }
        return result;
    }

    private static String removeChar(String s, int i) {
        return s.substring(0, i) + s.substring(i+1);
    }

    public static List<String> getPerms2(String s) {
        List<String> permutations = new ArrayList<String>();
        if(s.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char first = s.charAt(0);
        String remainder = s.substring(1);
        List<String> words = getPerms2(remainder);
        for(String word : words) {
            for(int j=0; j <= word.length(); ++j) {
                permutations.add(insertCharAt(word, first, j));
            }
        }

        return permutations;
    }

    public static String insertCharAt(String word, char c, int i) {
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start + c + end;


    }
}
