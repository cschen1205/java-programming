package com.github.cschen1205.jp.chap3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by memeanalytics on 28/6/17.
 */
public class Q04UnitTest {

    @Test
    public void test(){
        int n = 5;
        Q04.Tower[] towers = new Q04.Tower[3];
        for(int i=0; i < 3; ++i) towers[i] = new Q04.Tower(i);
        for(int i=n-1; i >=0; i--) towers[0].add(i);
        towers[0].moveDisks(n, towers[2], towers[1]);
        towers[2].print();
    }
}