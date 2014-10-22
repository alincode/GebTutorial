package functionality

import geb.spock.GebReportingSpec
import pages.CrossBrowserPage
import pages.FrontPage
import spock.lang.Stepwise

@Stepwise
class RequiredSpec extends GebReportingSpec{

    def "test required"(){
        when:
        to FrontPage
        testRequired.click()

        then:
        true
    }

}
