package baseTest;

import enums.Browsers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


   public class TestBase {
      /* public static WebDriver driver;

       public WebDriver selectBrowsers(String browser) {
           if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
               ChromeOptions chromeOptions = new ChromeOptions();
               chromeOptions.addArguments("--disable notifications");
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver(chromeOptions);
           } else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) ;
           {

           }
           return driver;
       }

       public WebDriver getDriver() {
           return driver;
       }*/
       public static WebDriver driver;
       public WebDriver selectBrowser(String browser)
       {
           if( browser.equalsIgnoreCase(Browsers.CHROME.name()))
           {
               ChromeOptions chromeOptions= new ChromeOptions();
               chromeOptions.addArguments("--disable notifications");
               WebDriverManager.chromedriver().setup();
               driver= new ChromeDriver(chromeOptions);}
           else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name()));
           {

       }
        return driver;
        }
public WebDriver getDriver(){
    return driver;}}


