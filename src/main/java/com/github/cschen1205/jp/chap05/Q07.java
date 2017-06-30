package com.github.cschen1205.jp.chap05;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by memeanalytics on 30/6/17.
 */
public class Q07 {
    public static class BitInteger {
        private int value;
        public BitInteger(int  value){
            this.value = value;
        }
        public int fetch(int column) {
            return (value & 1 << column) > 0 ? 1 : 0;
        }
    }
    public static int findMissing(List<BitInteger> array) {
        return findMissing(array, Integer.SIZE-1);
    }

    public static int findMissing(List<BitInteger> array, int column) {
        List<BitInteger> ones = new ArrayList<>();
        List<BitInteger> zeroes = new ArrayList<>();
        for(BitInteger val :array) {
            if(val.fetch(column) == 1) {
                ones.add(val);
            } else {
                zeroes.add(val);
            }
        }

        if(ones.size() >= zeroes.size()) {
            return (findMissing(zeroes, column-1) << 1 | 0);
        } else {
            return (findMissing(ones, column-1) << 1 | 1);
        }
    }

}
