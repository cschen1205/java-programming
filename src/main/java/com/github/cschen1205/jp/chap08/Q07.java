package com.github.cschen1205.jp.chap08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by memeanalytics on 4/7/17.
 */
public class Q07 {
    public static boolean check(int n, List<Integer> row) {
        for(int colIndex = 0; colIndex < row.size()-1; ++colIndex) {
            for(int j = colIndex+1; j < row.size(); ++j) {
                int diff = Math.abs(row.get(colIndex) - row.get(j));
                if(diff == 0 || diff == j - colIndex) return false;
            }
        }
        return true;
    }
    public static void nQueens(int n, List<Integer> row) {
        if(!check(n, row)){
            return;
        }
        if(row.size()==n){
            System.out.println(row.stream().map(i -> "" + i).collect(Collectors.joining(", ")));
        }
        for(int i=0; i < n; ++i){
            nQueens(n, add(row, i));
        }
    }

    private static List<Integer> add(List<Integer> row, int i) {
        List<Integer> result = new ArrayList<>(row);
        result.add(i);
        return result;
    }
}
