package com.github.cschen1205.jp.chap01;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by memeanalytics on 27/6/17.
 */
public class Q04UnitTest {

    @Test
    public void test() {
        assertFalse(Q04.anagram("How are you?", "You are how?"));
        assertTrue(Q04.anagram("how are you?", "you are? how"));
    }

}