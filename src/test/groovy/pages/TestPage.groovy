package pages

import geb.Page

class TestPage extends Page{

    static at = {}

    static url = "http://127.0.0.1:9095/"

    static content = {
        spockJobStatus {$('#job_spock img').attr("alt")}
    }
}