import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver

driver = { new FirefoxDriver() }

waiting {
    presets {
        verySlow {
            timeout = 1800
            retryInterval = 300
        }
        slow {
            timeout = 60
            retryInterval = 10
        }
        normal {
            timeout = 10
            retryInterval = 1
        }
        quick {
            timeout = 5
            retryInterval = 1
        }
    }
}

//atCheckWaiting = false

environments {

    chrome {
        driver = { new ChromeDriver() }
    }

    firefox {
        driver = { new FirefoxDriver()}
    }
}