package com.github.cschen1205.jp.chap08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by memeanalytics on 4/7/17.
 */
public class Q06 {
   public static int makeChange(int n, int denom) {
       int next_denom = 0;
       switch(denom) {
           case 25:
               next_denom = 10;
               break;
           case 10:
               next_denom = 5;
               break;
           case 5:
               next_denom = 1;
               break;
           case 1:
               return 1;
       }
       int ways = 0;
       for(int i = 0; i * denom < n; ++i) {
           ways += makeChange(n - i * denom, next_denom);
       }
       return ways;
   }
}
