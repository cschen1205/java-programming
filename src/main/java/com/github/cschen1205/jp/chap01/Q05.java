package com.github.cschen1205.jp.chap01;

/**
 * Created by memeanalytics on 27/6/17.
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees
 * Can you do this in place?
 */
public class Q05 {
    public static void rotateMatrix(int[][] A) {
        int N = A.length;
        for(int step=0; step < N / 2; ++step) {
            int first = step;
            int last = N-1-step;
            for(int i=first; i <=last; ++i) {
                int offset = i - first;
                int top = A[first][i];

                // left -> top
                A[first][i] = A[last - offset][first];

                // bottom -> left
                A[last-offset][first] = A[last][last-offset];

                // right -> bottom
                A[last][last-offset] = A[i][last];

                // top -> right
                A[i][last] = top;

            }
        }
    }
}
