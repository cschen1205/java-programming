package com.github.cschen1205.jp.chap10;

import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.testng.Assert.*;

/**
 * Created by memeanalytics on 9/7/17.
 */
public class Q04UnitTest {

    @Test
    public void test_neg(){
        assertThat(Q04.neg(100)).isEqualTo(-100);
    }

    @Test
    public void test_max(){
        assertThat(Q04.max(100, 101)).isEqualTo(101);
        assertThat(Q04.max(106, 101)).isEqualTo(106);
    }
}