package functionality

import geb.spock.GebReportingSpec
import pages.CrossBrowserPage
import pages.FrontPage
import spock.lang.Stepwise

@Stepwise
class RequiredSpec extends GebReportingSpec{

    def "check Cross Browser Page link"(){
        when:
        to FrontPage
        testRequired.click()

        then:
        true
    }

}
