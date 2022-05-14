package base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.HomePage1;
import pageObject.RegisterPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage1 {
   public static WebDriver driver;
   public static HomePage1 homePage1;
   public static RegisterPages registerPages;
   public static Properties props;

   @BeforeAll
           public static void setup() throws IOException {
props=new Properties();
       try {
           FileInputStream fs = new FileInputStream("src/main/java/config/data.properties");
           props.load(fs);
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }

       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.navigate().to(props.getProperty("url"));
       driver.manage().window().maximize();
       homePage1= new HomePage1(driver);

   }




    }

