package com.github.cschen1205.jp.chap08;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by memeanalytics on 2/7/17.
 */
public class Q04UnitTest {
    private static final Logger logger = LoggerFactory.getLogger(Q04UnitTest.class);
    @Test
    public void test_method1(){
        List<String> perms = Q04.getPerms("abcd");
        for(int i=0; i < perms.size(); ++i) {
            logger.info("perm #{}: {}", i, perms.get(i));
        }
    }

    @Test
    public void test_method2(){
        List<String> perms = Q04.getPerms2("abcd");
        for(int i=0; i < perms.size(); ++i) {
            logger.info("perm #{}: {}", i, perms.get(i));
        }
    }

}