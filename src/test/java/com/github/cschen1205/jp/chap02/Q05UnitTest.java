package com.github.cschen1205.jp.chap02;

import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.testng.Assert.*;

/**
 * Created by memeanalytics on 27/6/17.
 */
public class Q05UnitTest {
    @Test
    public void test(){
        Q05.Node A = new Q05.Node('A');
        Q05.Node B = new Q05.Node('B');
        Q05.Node C = new Q05.Node('C');
        Q05.Node D = new Q05.Node('D');
        Q05.Node E = new Q05.Node('E');
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;
        E.next = C;
        assertThat(Q05.find(A)).isEqualTo(C);
    }
}