package io.honeymon.study.spock

import spock.lang.Specification

/**
 * Spock을 사용할 때는 ~Spec 이라는 접미사를 많이 사용한다.
 */
class BasicSpec extends Specification{
    def "Test case"() {
        given:
            String format = "테스트 코드(%s)를 작성해봅시다."

        when:
            String literal = String.format(format, "Code")

        then:
            literal == "테스트 코드(Code)를 작성해봅시다."
    }
}
