package com.github.cschen1205.jp.chap01;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by memeanalytics on 27/6/17.
 * Implement an algorithm to determine if a string has all unique characters
 * What if you can not use additional data structures?
 */
public class Q01UnitTest {
    @Test
    public void testIsUniqueChars2() {
        assertFalse(Q01.isUniqueChars2("Hello World"));
        assertTrue(Q01.isUniqueChars2("Hi howareu?"));
    }

    @Test
    public void testIsUniqueChars() {
        assertFalse(Q01.isUniqueChars("hello world"));
        assertTrue(Q01.isUniqueChars("hi owareu?"));
    }
}
