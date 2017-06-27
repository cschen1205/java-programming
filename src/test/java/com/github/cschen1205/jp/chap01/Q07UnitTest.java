package com.github.cschen1205.jp.chap01;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by memeanalytics on 27/6/17.
 */
public class Q07UnitTest {

    @Test
    public void test(){
        assertTrue(Q07.isRotation("waterbottle", "erbottlewat"));
        assertFalse(Q07.isRotation("waterbottle", "elbottlewat"));
    }
}