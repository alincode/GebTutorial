package functionality

import geb.spock.GebReportingSpec
import pages.TestPage
import spock.lang.Stepwise

@Stepwise
class TestSpec extends GebReportingSpec{

    def "確認Jenkins執行狀態"(){
        when:
        to TestPage

        then:
        waitFor("quick"){
            println(new Date().getTimeString())
            spockJobStatus == "成功"
        }
    }

}
