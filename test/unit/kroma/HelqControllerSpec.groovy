package kroma

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HelqController)
class HelqControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Testing the right Sentence to Show when looking at index"() {
        when:
        controller.index()

        then:
        'I\'m here :P' == response.text
    }
}
