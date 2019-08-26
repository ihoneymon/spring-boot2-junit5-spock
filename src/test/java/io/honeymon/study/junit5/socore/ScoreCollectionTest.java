package io.honeymon.study.junit5.socore;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

class ScoreCollectionTest {

    @Test
    void answerArithmeticMeanOfTwoNumbers() {
        //given
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        //when
        int result = collection.arithmeticMean();

        //then
        assertThat(result, equalTo(6));
    }
}