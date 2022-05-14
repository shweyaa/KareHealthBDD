package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.HomePage;
import pageObject.RegisterPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class BasePage {
    public static WebDriver driver;
    public static HomePage homepage;
    public static RegisterPage registerPage;


public static Properties prop;



    @BeforeAll
            public static void setup() throws IOException {
        prop=new Properties();
        try


        {
            FileInputStream fs = new FileInputStream("src/main/java/config/data.properties");
            prop.load(fs);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homepage= new HomePage(driver);
        registerPage=new RegisterPage(driver);
        driver.navigate().to(prop.getProperty("url"));
        driver.manage().window().maximize();

    }
 public String getTitle()
    {
        return driver.getTitle();
    }


    /*@AfterAll
    public static void quit()
    {
        driver.quit();
    }
*/











}
