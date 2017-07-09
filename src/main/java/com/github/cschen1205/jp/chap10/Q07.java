package com.github.cschen1205.jp.chap10;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by memeanalytics on 9/7/17.
 * Design an algorithm to find the kth number such that the only prime factors are 3, 5, and 7 
 */
public class Q07 {
    public static int getKthMagicNumber(int k) {
        if (k <= 0) return 0;
      int val = 1;
      Queue<Integer> Q3 = new LinkedList<Integer>();
      Queue<Integer> Q5 = new LinkedList<Integer>();
      Queue<Integer> Q7 = new LinkedList<Integer>();
      Q3.add(3);
      Q5.add(5); Q7.add(7);
      for (--k; k > 0; --k) {
          // We’ve done one iteration already.
          val = Math.min(Q3.peek().intValue(),
                  Math.min(Q5.peek().intValue(), Q7.peek().intValue()));
          if (val == Q7.peek()) {
              Q7.remove();
          } else {
              if (val == Q5.peek()) {
                  Q5.remove();
              } else {
                  // must be from Q3
                  Q3.remove();
                  Q3.add(val * 3);
              }
              Q5.add(val * 5);
          }
          Q7.add(val * 7);
      }
      return val;
    }
}
