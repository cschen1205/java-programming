package com.github.cschen1205.jp.chap01;

/**
 * Created by memeanalytics on 27/6/17.
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0
 */
public class Q06 {
    public static void setZeroes(int[][] A) {
        int rowCount = A.length;
        int colCount = A[0].length;
        boolean[] rowZeroes = new boolean[rowCount];
        boolean[] colZeroes = new boolean[colCount];

        for(int i=0; i < rowCount; ++i) {

            for(int j=0; j < colCount; ++j) {
                if(A[i][j] == 0) {
                    rowZeroes[i] = true;
                    colZeroes[i] = true;
                }
            }
        }

        for(int i=0; i < rowCount; ++i) {
            for(int j=0; j < colCount; ++j)
            if(rowZeroes[i] || colZeroes[j]) {
                A[i][j] = 0;
            }
        }
    }
}
