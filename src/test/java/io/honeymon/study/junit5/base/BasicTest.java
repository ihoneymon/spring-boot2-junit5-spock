package io.honeymon.study.junit5.base;

import org.junit.jupiter.api.*;

public class BasicTest {

    @BeforeEach
    void setUp() {
        System.out.println("Junit5 setUp!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("JUnit5 teardown!");
    }

    @Test
    @DisplayName("간단한 테스트")
    public void test() {
        Long left = 10L;
        Long right = 20L;

        Long result = left + right;
        Long expect = 30L;

        Assertions.assertEquals(expect, result);
    }

    @Test
    @DisplayName("간단한 테스트2")
    public void test2() {
        Long left = 10L;
        Long right = 20L;

        Long result = left + right;
        Long expect = 30L;

        Assertions.assertEquals(expect, result);
    }
}
