package com.github.cschen1205.jp.chap08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by memeanalytics on 1/7/17.
 */
public class Q03 {
    public static List<List<Integer>> getAllSubsets(List<Integer> set, int index) {
        if (index < 0){
            List<List<Integer>> allSubsets = new ArrayList<>();
            allSubsets.add(new ArrayList<>());
            return allSubsets;
        } else {
            List<List<Integer>> allSubsets = getAllSubsets(set, index-1);
            int item = set.get(index);
            List<List<Integer>> newSubsets =new ArrayList<>();
            for(List<Integer> subset : allSubsets){
                List<Integer> newSubset = new ArrayList<>();
                newSubset.addAll(subset);
                newSubset.add(item);
                newSubsets.add(newSubset);
            }
            newSubsets.add(Arrays.asList(item));
            allSubsets.addAll(newSubsets);
            return allSubsets;
        }

    }

}
