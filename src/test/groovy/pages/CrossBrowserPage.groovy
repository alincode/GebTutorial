package pages

import geb.Page

class CrossBrowserPage extends Page {

    static at = {$('#main h1').first().text() == 'Cross Browser Automation'}

    static url = "/crossbrowser"

    static content = {
        topic3 { $('#main h1').last().text() }
    }
}
