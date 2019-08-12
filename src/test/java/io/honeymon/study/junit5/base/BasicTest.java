package io.honeymon.study.junit5.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasicTest {
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
