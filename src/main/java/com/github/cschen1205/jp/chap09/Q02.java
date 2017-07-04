package com.github.cschen1205.jp.chap09;

/**
 * Created by memeanalytics on 4/7/17.
 */
public class Q02 {
    public static int binarySearch(int[] a, int x, int lo, int hi) {
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if(x == a[mid]){
                return mid;
            } else if(a[lo] <= a[mid]) {
                if(x > a[mid]) {
                    lo = mid+1;
                } else if(x >= a[lo]) {
                    hi = mid-1;
                } else {
                    lo = mid+1;
                }
            } else {
                if(x < a[mid]) {
                    hi = mid - 1;
                } else if(x <= a[hi]){
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }

        }
        return -1;
    }
}
