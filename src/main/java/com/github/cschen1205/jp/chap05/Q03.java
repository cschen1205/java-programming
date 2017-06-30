package com.github.cschen1205.jp.chap05;

/**
 * Created by memeanalytics on 30/6/17.
 */
public class Q03 {
    public static boolean getBit(int n, int index) {
        return (n & (1 << index)) > 0;
    }

    public static int setBit(int n, int index, boolean b) {
        if(b) {
            return n | (1 << index);
        } else {
            int mask = ~(1 << index);
            return n & mask;
        }
    }

    public static int getNext(int n) {
        int index = 0;
        int oneCounts = 0;

        // find first one
        while(!getBit(n,index++)) {

        }

        // turn on next zero
        while(getBit(n, index++)) {
            oneCounts++;
        }
        n = setBit(n,index, true);

        // tunr off prev one
        index--;
        n = setBit(n, index, false);
        oneCounts--;

        // set zeroes
        for(int i=index-1; i >= oneCounts; i--) {
            n = setBit(n, i, false);
        }

        // set ones
        for(int i= oneCounts-1; i >= 0; i--) {
            n = setBit(n, i, true);
        }

        return n;


    }

    public static int getPrev(int n) {
        int index = 0;
        int countZeroes = 0;
        while(getBit(n, index)) {
            index++;
        }
        while(!getBit(n, index++)) {
            countZeroes++;
        }
        n = setBit(n, index, false);

        index--;
        n = setBit(n, index, true);
        countZeroes--;

        // set ones
        for(int i = index-1; i >= countZeroes; --i) {
            n = setBit(n, i, true);
        }

        // set zeroes
        for(int i=countZeroes-1; i >= 0; --i) {
            n = setBit(n, i, false);
        }

        return n;
    }

}
