package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.Dashboard;
import pageObject.LoginPage;

public class BasePage {
    public static WebDriver driver;
    public static LoginPage loginPage;
    public static Dashboard dashboard;
@BeforeAll
        public static void setup()
{

WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.navigate().to("http://karehealth.menpaniproducts.com/admin/auth/login");
driver.manage().window().maximize();
loginPage=new LoginPage(driver);
dashboard= new Dashboard(driver);



}

}
