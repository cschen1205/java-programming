package com.github.cschen1205.jp.chap08;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by memeanalytics on 4/7/17.
 */
public class Q06UnitTest {

    @Test
    public void test(){
        System.out.println(Q06.makeChange(100, 25));
    }
}