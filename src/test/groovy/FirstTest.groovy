import geb.Browser

Browser.drive {

    go "http://www.gebish.org"

    assert $('#main h1').first().text() == "What is it?"

    $('#sidebar li a').first().click()

    assert $('#main h1').first().text() == "Cross Browser Automation"
}