package com.github.cschen1205.jp.chap09;

/**
 * Created by memeanalytics on 4/7/17.
 */
public class Q01 {
    public static void mergeSort(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int i = m-1;
        int j = n-1;
        for(int k = m+n-1; k >= 0; --k){
            if(i < 0) {
                a[k] = b[j--];
            } else if(j < 0) {
                a[k] = a[i--];
            } else {
                if (a[i] > b[j]) {
                    a[k] = a[i--];
                } else {
                    a[k] = b[j--];
                }
            }
        }
    }
}
