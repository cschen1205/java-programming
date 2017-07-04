package com.github.cschen1205.jp.chap08;

/**
 * Created by memeanalytics on 4/7/17.
 * Implement an algorithm to print all valid (e g , properly opened and closed) combinations of n-pairs of parentheses
 */
public class Q05 {
    public static void printPar(int l, int r, String prefix){
        if(l < 0 || r < l) return;
        if(l == 0 && r == 0) {
            System.out.println(prefix);
            return;
        }
        if(l > 0)
            printPar(l-1, r, prefix + "(");
        if(r > l)
            printPar(l, r-1, prefix + ")");
    }
}
