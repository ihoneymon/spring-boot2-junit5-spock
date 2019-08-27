package io.honeymon.study;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * 애노테이션만 명확하게 구분지으면 한 클래스 안에서도 JUnit4 와 JUnit5 를 사용할 수도 있다.
 */
public class MixJunit4Junit5Test {
    @Before
    public void setUp4() throws Exception {
        System.out.println("JUnit4 setUp");
    }

    @BeforeEach
    void setUp5() {
        System.out.println("JUnit5 setUp");
    }

    @After
    public void tearDown4() throws Exception {
        System.out.println("JUnit4 tearDown");
    }

    @AfterEach
    void tearDown5() {
        System.out.println("JUnit5 tearDown");
    }

    @org.junit.Test
    public void testJUnit4() {
        System.out.println("JUnit4 execute");
    }

    @org.junit.jupiter.api.Test
    public void testJUnit5() {
        System.out.println("JUnit5 execute");
    }
}
