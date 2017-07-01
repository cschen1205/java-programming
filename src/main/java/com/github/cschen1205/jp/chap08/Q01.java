package com.github.cschen1205.jp.chap08;

/**
 * Created by memeanalytics on 1/7/17.
 * Write a method to generate the nth Fibonacci number
 */
public class Q01 {
    public static int fibo(int n) {
        if(n < 0) return -1; // error
        if(n <= 1) return n;
        return fibo(n-2) + fibo(n-1);
    }

    public static int fibo2(int n) {
        if(n < 0) return -1; // error
        if(n <= 1) return n;
        int value1 = 0;
        int value2 = 1;
        int value = -1;
        for(int i=2; i <= n; ++i) {
            value = value1 + value2;
            value1 = value2;
            value2 = value;
        }
        return value;
    }


}
