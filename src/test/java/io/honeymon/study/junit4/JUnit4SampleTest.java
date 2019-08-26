package io.honeymon.study.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnit4SampleTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("JUnit4 setUp!");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("JUni4 tearDown");
    }

    @Test
    public void execute() {
        System.out.println("JUnit4 testMethod executed.");
    }
}

