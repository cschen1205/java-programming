package com.github.cschen1205.jp.chap02;

import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.testng.Assert.*;

/**
 * Created by memeanalytics on 27/6/17.
 */
public class Q04UnitTest {

    @Test
    public void test(){
        Q04.Node n1 = Q04.Node.create(new int[] {3, 1, 5});
        Q04.Node n2 = Q04.Node.create(new int[] {5, 9, 2});
        Q04.Node n3 = Q04.add(n1, n2);
        assertThat(n3.toString()).isEqualTo("8->0->8");

    }
}