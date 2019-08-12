package io.honeymon.study.spock

import spock.lang.Specification

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class LocalDateTimeSpec extends Specification {

    void setup() {
        println "Set up!!"
    }

    /**
     * 테스트 실행 후처리
     */
    void cleanup() {
        println "Clean up!"
    }

    def "LocalDateTime of Min"() {
        given:
        LocalDate localDate = LocalDate.of(2019, 8, 1);

        when:
        LocalDateTime localDateTime = LocalDateTime.of(localDate, LocalTime.MIN)

        then:
        localDateTime.year == 2019
        localDateTime.monthValue == 8
        localDateTime.dayOfMonth == 1
        localDateTime.hour == 0
        localDateTime.minute == 0
        localDateTime.second == 0
    }

    def "LocalDateTime of MAX"() {
        given:
        LocalDate localDate = LocalDate.of(2019, 8, 1);

        when:
        LocalDateTime localDateTime = LocalDateTime.of(localDate, LocalTime.MAX)

        then:
        localDateTime.year == 2019
        localDateTime.monthValue == 8
        localDateTime.dayOfMonth == 1
        localDateTime.hour == 23
        localDateTime.minute == 59
        localDateTime.second == 59
    }
}
