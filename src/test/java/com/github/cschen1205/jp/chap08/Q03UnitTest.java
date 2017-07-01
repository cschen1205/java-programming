package com.github.cschen1205.jp.chap08;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by memeanalytics on 1/7/17.
 */
public class Q03UnitTest {

    private static final Logger logger = LoggerFactory.getLogger(Q03UnitTest.class);
    @Test
    public void test_method1(){
        List<Integer> set = Arrays.asList(1, 2, 3, 4);
        List<List<Integer>> subsets = Q03.getAllSubsets(set, set.size());
        for(int i=0; i < subsets.size(); ++i) {
            logger.info("set #{}: {}", i, subsets.get(i));
        }
    }

    @Test
    public void test_method2(){
        List<Integer> set = Arrays.asList(1, 2, 3, 4);
        List<List<Integer>> subsets = Q03.getAllSubsets2(set);
        for(int i=0; i < subsets.size(); ++i) {
            logger.info("set #{}: {}", i, subsets.get(i));
        }
    }

    @Test
    public void test_method3(){
        List<Integer> set = Arrays.asList(1, 2, 3, 4);
        List<List<Integer>> subsets = Q03.getAllSubsets3(set);
        for(int i=0; i < subsets.size(); ++i) {
            logger.info("set #{}: {}", i, subsets.get(i));
        }
    }


}