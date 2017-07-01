package com.github.cschen1205.jp.chap08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by memeanalytics on 1/7/17.
 */
public class Q03 {
    public static List<List<Integer>> getAllSubsets(List<Integer> set, int index) {
        if (index < 0) {
            List<List<Integer>> allSubsets = new ArrayList<>();
            return allSubsets;
        } else if (index == set.size()) {
            List<List<Integer>> allSubsets = getAllSubsets(set, index - 1);
            allSubsets.add(new ArrayList<>());
            return allSubsets;
        } else {
            List<List<Integer>> allSubsets = getAllSubsets(set, index - 1);
            int item = set.get(index);
            List<List<Integer>> newSubsets = new ArrayList<>();
            for (List<Integer> subset : allSubsets) {
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

    public static List<List<Integer>> getAllSubsets2(List<Integer> set) {
        int index = 1;
        List<List<Integer>> allSubsets = new ArrayList<>();
        List<List<Integer>> front = new ArrayList<>();
        for (Integer item : set) {
            front.add(Arrays.asList(item));
        }
        allSubsets.addAll(front);

        while (++index < set.size()) {

            List<List<Integer>> newFront = new ArrayList<>();

            for (int i = 0; i < front.size() - 1; ++i) {
                for (int j = i + 1; j < front.size(); ++j) {
                    boolean can_join = true;
                    for (int k = 0; k < index - 2; ++k) {
                        if (front.get(i).get(k) != front.get(j).get(k)) {
                            can_join = false;
                        }
                    }
                    if (can_join) {
                        int tail_i = front.get(i).get(index - 2);
                        int tail_j = front.get(j).get(index - 2);
                        List<Integer> newSet = new ArrayList<>();
                        if (tail_i > tail_j) {
                            newSet.addAll(front.get(j));
                            newSet.add(tail_i);
                        } else {
                            newSet.addAll(front.get(i));
                            newSet.add(tail_j);
                        }
                        newFront.add(newSet);
                    }
                }
            }

            allSubsets.addAll(newFront);

            front = newFront;
        }

        allSubsets.add(set);
        allSubsets.add(new ArrayList<>());

        return allSubsets;
    }

    public static List<List<Integer>> getAllSubsets3(List<Integer> set) {
        List<List<Integer>> allsubsets = new ArrayList<>();
        int max = 1 << set.size();
        for (int i = 0; i < max; i++) {
            List<Integer> subset = new ArrayList<Integer>();
            int k = i;
            int index = 0;
            while (k > 0) {
                if ((k & 1) > 0) {
                    subset.add(set.get(index));
                }
                k >>= 1;
                index++;
            }
            allsubsets.add(subset);
        }
        return allsubsets;
    }
}
