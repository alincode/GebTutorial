package functionality

import geb.spock.GebReportingSpec
import pages.CrossBrowserPage
import pages.FrontPage
import spock.lang.Stepwise

@Stepwise
class TestSpec extends GebReportingSpec{

    def "check Cross Browser Page link"(){
        given:
        to FrontPage

        when:
        item1.click(CrossBrowserPage)

        then:
        topic3 == 'Headless Browsers'
    }

}
