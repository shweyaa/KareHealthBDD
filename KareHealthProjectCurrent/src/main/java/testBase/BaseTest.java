package testBase;

import enums.Browsers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {


public static WebDriver driver;

    public WebDriver selectBrowser(String browser) {
        if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--disable-notifications");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
        } else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
        }
        return driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
