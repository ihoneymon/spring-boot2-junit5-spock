package io.honeymon.study.junit5.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnit5SampleTest {
    @BeforeEach
    void setUp() {
        System.out.println("JUnit5 setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("JUnit5 tearDown");
    }

    @Test
    void name() {
        System.out.println("JUnit5 execute");
    }
}
