package com.github.cschen1205.jp.chap09;

/**
 * Created by memeanalytics on 4/7/17.
 * Given a sorted array of strings which is interspersed with empty strings, write a method to find the location of a given string
 */
public class Q05 {
    public int search(String[] a, String x, int lo, int hi) {
        while(lo <= hi){
            while(lo <= hi && a[hi].equals("")) {
                hi--;
            }
            if(lo > hi) break;

            int mid = (lo + hi) / 2;

            boolean found = true;
            while(a[mid].equals("")) {
                mid++;
                if(mid > hi) {
                    found = false;
                    break;
                }
            }

            if(found == false) {
                mid = (lo+hi) / 2;
                while(a[mid].equals("")) {
                    mid--;
                    if(mid < lo) {
                        found = false;
                        break;
                    }
                }
            }

            if(!found) {
                return -1;
            }

            if(x.equals(a[mid])) {
                return mid;
            }
            else if(x.compareTo(a[mid]) < 0){
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }
}
