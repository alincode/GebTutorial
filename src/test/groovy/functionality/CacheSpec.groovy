package functionality

import geb.spock.GebReportingSpec
import pages.FrontPage
import spock.lang.Stepwise

@Stepwise
class CacheSpec extends GebReportingSpec{

    def "test cache true"(){
        when:
        to FrontPage
        assert theValue1 == 1
        value1 = 2
        assert theValue1 == 1

        then:
        true
    }

    def "test cache false"(){
        when:
        assert theValue2 == 1
        value2 = 2
        assert theValue2 == 2

        then:
        true
    }

}
