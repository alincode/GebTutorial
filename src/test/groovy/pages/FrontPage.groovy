package pages

import geb.Page

class FrontPage extends Page {

    static at = {$('#main h1').first().text() == 'What is it?' }

    static url = ""

    static content = {
        item1 { $('#sidebar li a').first() }
    }
}