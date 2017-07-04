package com.github.cschen1205.jp.chap08;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

/**
 * Created by memeanalytics on 4/7/17.
 */
public class Q07UnitTest {

    @Test
    public void test(){
        Q07.nQueens(8, new ArrayList<>());
    }
}